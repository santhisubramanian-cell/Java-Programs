package ifelse;
import java.util.Scanner;
public class Bankloan2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int credit = scan.nextInt();
		double income = scan.nextDouble();
		double debit  = scan.nextDouble();
		scan.nextLine();
		String loan = scan.nextLine();
		String crange="Good";
		String drange="Excellent";
		String status="Rejected";
		double amt = 0;
		if(credit<600 || debit>50) {
			System.out.println("Loan Ststus: Rejected");
		}
		if(credit>=700) {
			crange="Excellent";
		}
		else if(credit>=700 && credit<=749) {
			crange="Good";
		}
		else if(credit>=650 && credit<=699) {
			crange="Fair";
		}
		else if(credit<650) {
			crange="Poor";
		}
		if(debit<=30) {
			drange="Low";
		}
		else if(debit>=31 && debit<=400) {
			drange="Moderate";
		}
		else if(debit>40) {
			drange="High";
		}
		if(loan.equals("Home")) {
			if(crange.equals("Excellent")) {
				if(drange.equals("Low")) {
					status="Approved";
					amt=4*income;
				}
			}
			else if(crange.equals("Good")) {
				if(drange.equals("Moderate")) {
					status="Needs Review";
					amt=3*income;
				}
			}
		}
		else if(loan.equals("Personal")) {
			if(crange.equals("Excellent")) {
				if(drange.equals("Low")) {
					status="Approved";
					amt=1*income;
				}
			}
			else if(crange.equals("Fair")) {
				if(drange.equals("Moderate")) {
					status="Needs Review";
					amt=0.5*income;
				}
			}
		}
		else if(loan.equals("Business")) {
			if(crange.equals("Excellent") || crange.equals("Good")) {
				if(drange.equals("Low") || drange.equals("Moderate")) {
					status="Approved";
					amt=3*income;
				}
			}
		}
		System.out.println("Credit Score"+credit);
		System.out.println("Annual Income: $"+income);
		System.out.println("Debt-to-Income Ratio:"+debit+"%");
		System.out.println("Loan Type: "+loan);
		System.out.println("Decision: "+status);
		System.out.println("Maximum Loan Amount: "+amt);
		

	}

}

