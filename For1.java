package forloop;
import java.util.Scanner;
public class For1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		scan.nextLine();
		int incrementper =0;
		double basesalry=0;
		String empname="";
		int performancerating=0;
		double finalsalry=0;
		double sum=0;
		for(int i=1;i<=n;i++) {
			empname = scan.nextLine();
			basesalry = scan.nextDouble();
			performancerating = scan.nextInt();
			scan.nextLine();
			
			if(performancerating == 5) {
				incrementper=15;
			}
			else if(performancerating == 4) {
				incrementper=10;
			}
			else if(performancerating == 3) {
				incrementper=5;
			}
			else if(performancerating == 2) {
				incrementper=2;
			}
			else if(performancerating == 1) {
				incrementper=0;
			}
			finalsalry = basesalry*(1+incrementper/100.0);
			sum+=finalsalry;
			System.out.println("Employee: "+empname);
			System.out.println("Base Salary: "+basesalry);
			System.out.println("Performance Rating: "+performancerating);
			System.out.println("Increment:  "+incrementper);
			System.out.println("Final Salary: "+finalsalry);
		}
		
		double avg = sum/n;
		
		System.out.println("Total Employees Processed: "+n);
		System.out.println("Total Payroll: "+sum);
		System.out.println("Average Salary:  "+avg);
		
		

		
		
		

	}

}
