package nestedloop;
import java.util.Scanner;
public class Nested15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int fullstar=0;
		int total=0;
		for(int i=1;i<=n;i++) {
			String name = scan.nextLine();
			scan.nextLine();
			double rating = scan.nextDouble();
			
			total+=rating;
			fullstar = (int)rating;
			for(int j=1;j<=5;j++) {
				if(j<=fullstar) {
					System.out.print("★");
				}
				else {
					System.out.print("☆");
				}
				
			}
			System.out.println();
			
		}
		double avg = total/n;
		System.out.println("Avg:"+avg);
	}

}
