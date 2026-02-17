package ifelse;
import java.util.Scanner;
public class Ecommerce {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String loyaltytier = scan.nextLine();
		Double cartvalue = scan.nextDouble();
		String product = scan.nextLine();
		scan.nextLine();
		String member = scan.nextLine();
		
		double basediscount =0;
		double additional =0;
		
		if(loyaltytier.equals("Bronze")) {
			basediscount=5;
		}
		else if(loyaltytier.equals("Silver")) {
			basediscount=8;
		}
		else if(loyaltytier.equals("Gold")) {
			basediscount=12;
		}
		else if(loyaltytier.equals("Platinum")) {
			basediscount=15;
		}
		if(cartvalue>=500 && cartvalue<=999) {
			additional+=3;
		}
		else if(cartvalue>=1000 && cartvalue>=1999) {
			additional+=5;
		}
		else if(cartvalue>=2000) {
			additional+=7;
		}
		if(product.equals("Electronics") && member.equals("Prime") ) {
			additional+=5;
		}
		else if(product.equals("Fashion")) {
			additional+=3;
		}
		else if(product.equals("Books") && member.equals("prime")) {
			additional+=5;
		}
		else if(product.equals("Groceries") && cartvalue>300) {
			additional+=2;
		}
		double total = basediscount+additional;
		double finalprice = cartvalue*(1-total/100);
		double savings = cartvalue-finalprice;
		System.out.println("Loyalty Tier: "+loyaltytier);
		System.out.println("Cart value "+cartvalue);
		System.out.println("product category: "+product);
		System.out.println("membership: "+member);
		System.out.println("base discount "+basediscount);
		System.out.println("Additional "+additional);
		System.out.println("Total "+total);
		System.out.println("Final price "+finalprice);
		System.out.println("Savings "+savings);
	}

}
