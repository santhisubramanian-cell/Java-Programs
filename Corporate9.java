package ifelse;
import java.util.Scanner;
public class Corporate9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double  annualrevenue = scan.nextDouble();
		scan.nextLine();
		String businesstype = scan.nextLine();
		double deductibleExpenses = scan.nextDouble();
		double taxcredits = scan.nextDouble();
		int taxrate=0;
		double taxableincome = annualrevenue-deductibleExpenses;
		if(businesstype.equals("C-Corp")) {
			if(taxableincome<=500000) {
				taxrate=21;
			}
			else if(taxableincome>500000 && taxableincome<=1000000) {
				taxrate=24;
			}
			else if(taxableincome>1000000 && taxableincome<=2000000) {
				taxrate=28;
			}
			else if(taxableincome>2000000) {
				taxrate=30;
			}
		}
		else if(businesstype.equals("S-Corp")) {
			if(taxableincome<=500000) {
				taxrate=20;
			}
			else if(taxableincome>500000 && taxableincome<=1000000) {
				taxrate=25;
			}
			else if(taxableincome>1000000) {
				taxrate=28;
			}
		}
		else if(businesstype.equals("LLC")) {
			if(taxableincome<=200000) {
				taxrate=15;
			}
			else if(taxableincome>200000 && taxableincome<=500000) {
				taxrate=18;
			}
			else if(taxableincome>500000) {
				taxrate=22;
			}
		}
		else if(businesstype.equals("Partnership")) {
			if(taxableincome<=300000) {
				taxrate=18;
			}
			else if(taxableincome>300000 && taxableincome<=800000) {
				taxrate=22;
			}
			else if(taxableincome>=800000) {
				taxrate=26;
			}
		}
		double grosstax = taxableincome*(taxrate/100.0);
		double nettax = grosstax-taxcredits;
		double effectiverate = (nettax/annualrevenue)*100;
		System.out.println("Annual Revenue: "+annualrevenue);
		System.out.println("Business type: "+businesstype);
		System.out.println("Deductable Expenses: "+deductibleExpenses);
		System.out.println("tax credit: "+taxcredits);
		System.out.println("Taxable income: "+taxableincome);
		System.out.println("Tax rate: "+taxrate);
		System.out.println("Gross tax: "+grosstax);
		System.out.println("Net tax: "+nettax);
		System.out.println("Effective Tax: "+effectiverate);
		
		
		
	}

}
