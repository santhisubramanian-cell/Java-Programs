package whiledowhile;
import java.util.Scanner;
public class While11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		int num1=a;
		int num2=b;
		while(num2!=0) {
			int temp = num2;
			num2 = num1%num2;
			num1=temp;
		}
		System.out.println("GCD OF"+a+"and"+b+"="+num1);		

	}

}
