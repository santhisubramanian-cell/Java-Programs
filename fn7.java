package functions;
import java.util.Scanner;
public class fn7 {
	public static int power(int base,int expo) {
		int value =1;
		for(int i=1;i<=expo;i++) {
			value*=base;
		}
		return value;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int base = scan.nextInt();
		
		int expo = scan.nextInt();
		
		int res = power(base,expo);
		System.out.println(res);

	}

}
