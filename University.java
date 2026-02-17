package ifelse;
import java.util.Scanner;
public class University {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double cgpa = scan.nextDouble();
		double income=scan.nextDouble();
		int ecscore = scan.nextInt();
		scan.nextLine();
		String scholartype = scan.nextLine();
		
		double amt = 0;
		String category = "None";
		String status = null;
		
		if(cgpa>=2.5) {
			status="Eligible";
			if(scholartype.equals("Merit")) {
				if(cgpa>=3.8 && ecscore>=80) {
					amt=25000;
					category="Full";
				}
				else if(cgpa>=3.5 && ecscore>=70) {
					amt=15000;
					category="Partial";
				}
				else if(cgpa>=3.0 && ecscore>=60) {
					amt=8000;
					category="Minimal";
				}
				else {
					status="Not Eligible";
				}
			}
			else if(scholartype.equals("Need-Based")) {
				if(income<=30000 && cgpa>=3.5) {
					amt=30000;
					category="Full";
				}
				else if(income<=50000 && cgpa>=3.0) {
					amt=18000;
					category="Partial";
				}
				else if(income<=70000 && cgpa>=2.8) {
					amt=10000;
					category="Minimal";
					
				}
				else {
					status="Not Eligible";
				}
			}
			else if(scholartype.equals("Sports")) {
				if(ecscore>=85 && cgpa>=3.0) {
					amt=22000;
					category="Full";
				}
				else if(ecscore>=75 && cgpa>=2.8) {
					amt=20000;
					category="Partial";
				}
				else if(ecscore>=65 && cgpa>=2.5) {
					amt=12000;
					category="Minimal";
				}
				else {
					status="Not Eligible";
				}
			}
		}
		
		System.out.println("GPA: "+cgpa);
		System.out.println("Family income: "+income);
		System.out.println("Extracurricular: "+ecscore);
		System.out.println("Scholarship Type: "+scholartype);
		System.out.println("Eligibility: "+status);
		System.out.println("Award Amt: "+amt);
		System.out.println("Award Category: "+category);
	}

}
