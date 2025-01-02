package monsterPackage;

//using the java date class
import java.util.Date;

public class MonsterAttack {
	
	//private data variables
	private String monsterName;
	private String attackLocation;
	private double damagesInMillionUSD;
	private Date date;
	
	//Create whatever constructors, getters, and setters you need
	public MonsterAttack(String monsterName2, String attackLocation2, double damagesInMillionUSD2, Date date2) {
		this.monsterName = "";
		this.attackLocation = "";
		this.damagesInMillionUSD = 0.0;
		this.date = new Date(); //different because of the date class
	}
	
	//getter and setter for monsterName
	public String getMonsterName() {
		return monsterName;
	}
	
	public void setMonsterName(String monsterName) {
		this.monsterName = monsterName;
	}
	
	//getter and setter for attackLocation
	public String getAttackLocation() {
		return attackLocation;
	}
	
	public void setAttackLocation(String attackLocation) {
		this.attackLocation = attackLocation;
	}
	
	//getter and setter for damagesInMillionUSD
	public double getDamagesInMillionUSD() {
		return damagesInMillionUSD;
	}
	
	public void setDamagesInMillionUSD(double damagesInMillionUSD) {
		this.damagesInMillionUSD = damagesInMillionUSD;
	}
	
	//getter and setter for date
	public Date getDate() {
		return date;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	//Be sure to write a reasonable toString()
	@Override
	public String toString() {
		return "MonsterAttack [monsterName=" + monsterName + ", attackLocation=" + attackLocation 
                + ", damagesInMillionUSD=" + damagesInMillionUSD + ", date=" + date + "]";
	}
}