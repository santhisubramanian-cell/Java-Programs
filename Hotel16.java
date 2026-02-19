package ifelse;
import java.util.Scanner;
public class Hotel16 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String roomcategory = scan.nextLine();
		String season = scan.nextLine();
		int nightbooked = scan.nextInt();
		scan.nextLine();
		String loyaltytier = scan.nextLine();
		
		int baserate =0;
		double seasonalmul =0;
		int staydiscount=0;
		int loyaltydiscount=0;
		
		if(roomcategory.equals("Standard")) {
			baserate=150;
		}
		else if(roomcategory.equals("Deluxe")) {
			baserate=300;
		}
		else if(roomcategory.equals("Suite")) {
			baserate=500;
		}
		else if(roomcategory.equals("Presidential")) {
			baserate=1000;
		}
		if(season.equals("Off-Peak")) {
			seasonalmul=0.7;
		}
		else if(season.equals("Regular")) {
			seasonalmul=1.0;
		}
		else if(season.equals("Peak")) {
			seasonalmul=1.5;
		}
		else if(season.equals("Holiday")) {
			seasonalmul=2.0;
		}
		if(nightbooked>=1 && nightbooked<=4) {
			staydiscount=0;
		}
		else if(nightbooked>=5 && nightbooked<=7) {
			staydiscount=5;
		}
		if(nightbooked>=8 && nightbooked<=14) {
			staydiscount=10;
		}
		if(nightbooked>=15) {
			staydiscount=20;
		}
		if(loyaltytier.equals("None")) {
			loyaltydiscount=0;
		}
		else if(loyaltytier.equals("Member")) {
			loyaltydiscount=10;
		}
		else if(loyaltytier.equals("Gold")) {
			loyaltydiscount=15;
		}
		else if(loyaltytier.equals("Platinum")) {
			loyaltydiscount=20;
		}
		
		double seasonalrate = baserate*seasonalmul;
		double discountedrate = seasonalrate*(1-staydiscount/100.0)*(1-loyaltydiscount/100.0);
        double totalcost = discountedrate*nightbooked;
        
        String upgrades = "None";
        if (loyaltytier.equals("Member") && !roomcategory.equals("Standard")) {
            upgrades = "Free breakfast";
        }
        if (loyaltytier.equals("Gold") && !roomcategory.equals("Standard")) {
            upgrades = "Free breakfast and spa access";
        }
        if (loyaltytier.equals("Platinum") && roomcategory.equals("Presidential")) {
            upgrades = "Concierge service, airport transfer, and fine dining";
        }

        System.out.println("Room Category: " + roomcategory);
        System.out.println("Season: " + season);
        System.out.println("Nights Booked: " + nightbooked);
        System.out.println("Loyalty Tier: " + loyaltytier);
        System.out.println("Base Rate Per Night: $" + baserate);
        System.out.println("Seasonal Multiplier: " + seasonalmul + "x");
        System.out.println("Extended Stay Discount: " + staydiscount + "%");
        System.out.println("Loyalty Discount: " + loyaltydiscount + "%");
        System.out.println("Nightly Rate: $" + discountedrate);
        System.out.println("Total Booking Cost: $" + totalcost);
        System.out.println("Complimentary Upgrades: " + upgrades);

        
        
        
        
        
        
        
        
        
        
        
        
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
