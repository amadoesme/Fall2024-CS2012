package monsterPackage;

//library from book
import java.util.Date;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class AttackMonitor {

	//private data variables
    private MonsterAttack[] attacks;
    private int attackCount;

    //array loop so it can count up to 5 attacks
    public AttackMonitor() {
        attacks = new MonsterAttack[5];
        attackCount = 0;
    }

    //method to report monster attacks
    public void reportAttacks() {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for attack " + (i + 1) + ":");

            System.out.print("Monster Name: ");
            String monsterName = scanner.nextLine();

            System.out.print("Attack Location: ");
            String attackLocation = scanner.nextLine();

            System.out.print("Damages in Million USD: ");
            double damagesInMillionUSD;
            while (true) {
                try {
                    damagesInMillionUSD = Double.parseDouble(scanner.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("enter a valid number for damages.");
                }
            }

            System.out.print("Date (yyyy-mm-dd): ");
            Date date;
            while (true) {
                try {
                    String dateString = scanner.nextLine();
                    date = dateFormat.parse(dateString);
                    break;
                } catch (ParseException e) {
                    System.out.println("use yyyy-mm-dd.");
                }
            }

            //adding the monster attack to the array
            attacks[i] = new MonsterAttack(monsterName, attackLocation, damagesInMillionUSD, date);
            attackCount++;
        }
    }

    //iterating through the array and printing the result of each attack
    public void showAttacks() {
        for (int i = 0; i < attackCount; i++) {
            System.out.println(attacks[i]);
        }
    }

    //calculates and prints the total amount of damages for all attacks and the mean damages
    public void showDamages() {
        double totalDamages = 0;
        for (int i = 0; i < attackCount; i++) {
            totalDamages += attacks[i].getDamagesInMillionUSD();
        }
        double meanDamages = (attackCount > 0) ? totalDamages / attackCount : 0;

        System.out.println("Total Damages: " + totalDamages + " million USD");
        System.out.println("Mean Damages: " + meanDamages + " million USD");
    }

    //shows the names of all monsters involved in the attacks and the number of attacks for each monster
    public void showMonsters() {
        String[] monsterNames = new String[attackCount];
        int[] monsterCounts = new int[attackCount];
        int uniqueMonsters = 0;

        for (int i = 0; i < attackCount; i++) {
            String monsterName = attacks[i].getMonsterName();
            boolean found = false;

            for (int j = 0; j < uniqueMonsters; j++) {
                if (monsterNames[j].equals(monsterName)) {
                    monsterCounts[j]++;
                    found = true;
                    break;
                }
            }

            if (!found) {
                monsterNames[uniqueMonsters] = monsterName;
                monsterCounts[uniqueMonsters] = 1;
                uniqueMonsters++;
            }
        }

        for (int i = 0; i < uniqueMonsters; i++) {
            System.out.println(monsterNames[i] + ": " + monsterCounts[i] + " attack(s)");
        }
    }

    //menu method 
    public void menu() {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        //offers the user the opportunity to run any of the methods listed above or to quit
        while (!exit) {
            System.out.println("\nMenu:");
            System.out.println("1. Report Attacks");
            System.out.println("2. Show Attacks");
            System.out.println("3. Show Damages");
            System.out.println("4. Show Monsters");
            System.out.println("5. Quit");
            System.out.print("Choose an option: ");

            int choice;
            while (true) {
                try {
                    choice = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("enter a number between 1 and 5.");
                }
            }

            switch (choice) {
                case 1:
                    reportAttacks();
                    break;
                case 2:
                    showAttacks();
                    break;
                case 3:
                    showDamages();
                    break;
                case 4:
                    showMonsters();
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Try again.");
            }
        }
        scanner.close();
    }
}
