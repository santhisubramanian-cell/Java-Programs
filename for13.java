package forloop;
import java.util.Scanner;
public class for13 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		
		int rejectcount=0;
		int eligiblecount =0;
		String status = "";
		String reason = "";
		for(int i=1;i<=n;i++) {
			String name = scan.nextLine();
			scan.nextLine();
			int age = scan.nextInt();
			double weight = scan.nextDouble();
			double hemo = scan.nextDouble();
			
			if(age>=18 && age<=65 && weight>=50 && hemo>=12.5) {
				status = "Eligible";
				eligiblecount++;
			}
			else if(age<18) {
				status = "Not Eligible";
				reason = "age below 18";
				rejectcount++;
				
			}
			else if(weight<50) {
				status= "Not Eligible";
				reason = "weight below 50";
				rejectcount++;
			}
			else if(hemo<12.5) {
				status= "Not Eligible";
				reason = "Hemoglobin below 12.5g/dl";
				rejectcount++;
			}
			System.out.println("Donar:"+name);
			System.out.println("Age:"+age);
			System.out.println("weight:"+weight);
			System.out.println("hemoglobin:"+hemo);
			System.out.println("Status:"+status);
			System.out.println("Reason:"+reason);
			
		
		}
		double rate = (eligiblecount/n)*100.0;
		System.out.println("totalDonar:"+n);
		System.out.println("eligible donar:"+eligiblecount);
		System.out.println("rejected donar:"+rejectcount);
		System.out.println("eligiblity rate:"+rate);
		
		
		
		
	}
}
