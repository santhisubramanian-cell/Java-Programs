package ifelse;
import java.util.Scanner;
public class Software15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int usercount = scan.nextInt();
		scan.nextLine();
		String licensetype = scan.nextLine();
		String supportlevel = scan.nextLine();
		int contractyear = scan.nextInt();
		
		int baseprice = 0;
		int volumediscount=0;
		int supportfee=0;
		int multiyear=0;
		
		if(licensetype.equals("Standard")) {
			baseprice=60;
		}
		else if(licensetype.equals("Professional")) {
			baseprice=120;
		}
		if(licensetype.equals("Enterprice")) {
			baseprice=200;
		}
		if(usercount>=1 && usercount<=50) {
			volumediscount=0;
		}
		else if(usercount>=51 && usercount<=200) {
			volumediscount=15;
		}
		else if(usercount>=201 && usercount<=500) {
			volumediscount=20;
		}
		else if(usercount>=501 && usercount<=1000) {
			volumediscount=25;
		}
		else if(usercount>1001) {
			volumediscount=35;
		}
		if(supportlevel.equals("Basic")) {
			supportfee=10;
		}
		else if(supportlevel.equals("Priority")) {
			supportfee=30;
		}
		else if(supportlevel.equals("Premium")) {
			supportfee=80;
		}
		if(contractyear == 1) {
			multiyear=0;
		}
		else if(contractyear == 2) {
			multiyear=5;
		}
		else if(contractyear == 3) {
			multiyear=10;
		}
		else if(contractyear == 5) {
			multiyear=20;
		}
		double discountedbase = baseprice*(1-volumediscount/100.0);
		double annualperuser = (discountedbase+supportfee)*(1-multiyear/100.0);
		double totalannual = annualperuser*usercount;
		double contractvalue = totalannual*contractyear;
		
		String pricingtier ="";
		
		if(usercount<200) {
			pricingtier="Small Business";
		}
		else if(usercount>=200 && usercount<=1000) {
			pricingtier="Mid-Market";
		}
		if(usercount>1000) {
			pricingtier="Enterprise";
		}
		System.out.println("user count: "+usercount);
		System.out.println("license type: "+licensetype);
		System.out.println("support level: "+supportlevel);
		System.out.println("contract : "+contractyear);
		System.out.println("base price: "+baseprice);
		System.out.println("volume discount: "+volumediscount);
		System.out.println("support fee: "+supportfee);
		System.out.println("multi year: "+multiyear);
		System.out.println("annual cost: "+annualperuser);
		System.out.println("total annual: "+totalannual);
		System.out.println("contract value: "+contractvalue);
		System.out.println("pricing tier: "+pricingtier);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
