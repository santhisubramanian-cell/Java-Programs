package whiledowhile;
import java.util.Scanner;
public class While2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int sum=0;
		int count =0;
		int num;
		while(true) {
			System.out.println("Enter number(0 to stop):");
			num = scan.nextInt();
			if(num==0) {
				break;
			}
			sum+=num;
			count++;
		}
		System.out.println("Total sum:"+sum);
		System.out.println("count:"+count);
	}

}
