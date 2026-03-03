package whiledowhile;
import java.util.Scanner;
public class While22 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int start= scan.nextInt();
		int end = scan.nextInt();
		
		int sum=0;
		
		while(start<=end) {
			if(start%2==0) {
				sum+=start;
			}
			start++;
		}
        System.out.println("sum of even numbers from"+start+"to"+end+":"+sum);

	}

}
