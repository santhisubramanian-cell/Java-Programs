package ifelse;
import java.util.Scanner;
public class Gym14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String memebershiptier = scan.nextLine();
		int contractmonth = scan.nextInt();
		scan.nextLine();
		String accesslevel = scan.nextLine();
		String addons = scan.nextLine();
		
		int basemonthly = 0;
		double contractdiscount = 0;
		int accessfee =0;
		int addonfee =0;
		
		if(memebershiptier.equals("Basic")) {
			basemonthly=40;
		}
		else if(memebershiptier.equals("Premium")) {
			basemonthly=80;
		}
		else if(memebershiptier.equals("Elite")) {
			basemonthly=120;
		}
		else if(memebershiptier.equals("VIP")) {
			basemonthly=150;
		}
		if(contractmonth == 1) {
			contractdiscount=0;
		}
		else if(contractmonth == 6) {
			contractdiscount=10;
		}
		else if(contractmonth == 12) {
			contractdiscount=15;
		}
		else if(contractmonth == 24) {
			contractdiscount=25;
		}
		if(accesslevel.equals("Single-Location")) {
			accessfee=0;
		}
		else if(accesslevel.equals("Regional")) {
			accessfee=20;
		}
		else if(accesslevel.equals("Nationwide")) {
			accessfee=50;
		}
		if(addons.equals("None")) {
			addonfee=0;
		}
		else if(addons.equals("Personal-Training")) {
			addonfee=100;
		}
		else if(addons.equals("Classes")) {
			addonfee=50;
		}
		else if(addons.equals("Full-Package")) {
			addonfee=200;
		}
		
		double discountedbase = basemonthly*(1-contractdiscount/100.0);
		double monthlytotal = discountedbase+accessfee+addonfee;
		double contracttotal = monthlytotal*contractmonth;
		double savings = (basemonthly+accessfee+addonfee)*contractmonth-contracttotal;
		
		String category="";
		if (monthlytotal <= 500) {
            category = "Budget";
        } else if (monthlytotal <= 1500) {
            category = "Standard";
        } else if (monthlytotal <= 3000) {
            category = "Premium";
        } else {
            category = "Luxury";
        }
		 System.out.println("Member tier: "+memebershiptier);
		 System.out.println("contract lenth: "+contractmonth);
		 System.out.println("Access level: "+accesslevel);
		 System.out.println("Add ons: "+addons);
		 System.out.println("monthly fee: "+basemonthly);
		 System.out.println("contract : "+contractdiscount);
		 System.out.println("access fee: "+accessfee);
		 System.out.println("add on fee: "+addonfee);
		 System.out.println("monthly total: "+monthlytotal);
		 System.out.println("contrct total: "+contracttotal);
		 System.out.println("savings: "+savings);
		 System.out.println("Member category: "+category);
		 
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
