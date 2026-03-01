package forloop;
import java.util.Scanner;
public class For17 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		scan.nextLine();
		
		String priority = "";
		int discount =0;
		int renewalfee =0; 
		int urgentrenewal =0;
		double total=0;
		double finalfee =0;
		for(int i=1;i<=n;i++) {
			String name = scan.nextLine();
			String type = scan.nextLine();
			int days = scan.nextInt();
			
			if(type.equals("Basic")) {
				renewalfee =50;
			}
			else if(type.equals("Premium")) {
				renewalfee =100;
			}
			else if(type.equals("VIP")) {
				renewalfee =200;
			}
			if(days>=45) {
				discount=20;
			}
			else if(days>=30 && days<=44) {
				discount=15;
			}
			else if(days>=15 && days<=20) {
				discount=10;
			}
			else if(days<15) {
				discount=0;
			}
			finalfee = renewalfee*discount/100.0;
			
			if(days<10) {
				priority ="Urgent";
				urgentrenewal++;
			}
			else if(days>=10 && days<=30) {
				priority ="High";
			}
			else if(days>30) {
				priority ="Normal";
			}
			
			total +=renewalfee;
			System.out.println("member:"+name);
			System.out.println("membership:"+type);
			System.out.println("days:"+days);
			System.out.println("renewal fee:"+renewalfee);
			System.out.println("discount:"+discount);
			System.out.println("final fee:"+finalfee);
			System.out.println("priority:"+priority);;
			
			
		}
		double avg = total/n;
		System.out.println("total mem:"+n);
		System.out.println("urgent renewal:"+urgentrenewal);
		System.out.println("total:"+total);
		System.out.println("avg:"+avg);
		
	}

}
