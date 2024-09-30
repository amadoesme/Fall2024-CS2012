package Cookies;

public class CookieMaker {
	
	public static void main(String[] args) {
		
		System.out.println("--- making cookies ---");
		FortuneCookie[] bunchOsnack = new FortuneCookie[5];
		
		bunchOsnack[0] = new FortuneCookie("You will have a great success day");
		bunchOsnack [1] = new FortuneCookie("A chance meeting brings opportunity");
		bunchOsnack[2] = new FortuneCookie("Tomorrow is 24 hours from now!");
		bunchOsnack[3] = new FortuneCookie("run away its your only hope");
		bunchOsnack[4] = new FortuneCookie("the gum under your seat still has some flavor");
		
//		String testmsg = bunchOsnack[4].getMessageYay();
//		System.out.println(testmsg);
		
		for(int i = 0; i < 5; i++) {
			System.out.println(bunchOsnack[i].getMessageYay());
		}
		
		System.out.println("done making cookies");
	}
}
