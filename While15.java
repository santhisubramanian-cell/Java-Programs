package whiledowhile;
import java.util.Scanner;
public class While15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int count=0;
		int temp=n;
		
		System.out.print(n+" ");
		if(n!=1) {
		do {
			if(n%2==0) {
				n=n/2;
			}
			else {
				n=3*n+1;
			}
			System.out.print(n+" ");
			count++;
		}
		while(n!=1);
		System.out.println(n);
		}
		System.out.println();
		System.out.println("steps"+count);
	}

}
