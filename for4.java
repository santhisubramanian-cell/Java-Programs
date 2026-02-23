package forloop;
import java.util.Scanner;
public class for4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int commisionrate=0;
		double bonus;
		int max=0;
		String topperfoermer="";
		double totalsales=0;
		double totalcommision=0;
		
		for(int i=1;i<=n;i++) {
			String repname = scan.nextLine();
			double salesamt = scan.nextDouble();
			
			if(salesamt>=0 && salesamt<=40000) {
				commisionrate=5;
			}
			else if(salesamt>=40001 && salesamt<=80000) {
				commisionrate=8;
			}
			else if(salesamt>=80001 && salesamt<=100000) {
				commisionrate=10;
			}
			else if(salesamt>=100001 && salesamt<=150000) {
				commisionrate=12;
			}
			else if(salesamt>150000) {
				commisionrate=15;
			}
			double commision = salesamt*(commisionrate/100.0);
			if(salesamt>=100000) {
				bonus=2000;
			}
			else if(salesamt>=150000) {
				bonus=3000;
			}
			else {
				bonus=0;
			}
			
			if(salesamt>max) {
				max=(int) salesamt;
				topperfoermer = repname;
			}
			totalsales+=salesamt;
			totalcommision+=commision;
			System.out.println("Sales name: "+repname);
			System.out.println("Sales amt: "+salesamt);
			System.out.println("commision rate: "+commisionrate);
			System.out.println("commision earned: "+commision);
			System.out.println("Bonus: "+bonus);
			System.out.println(": "+repname);
			
		}
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
