package whiledowhile;
import java.util.Scanner;
public class While24 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int binary = scan.nextInt();
		int temp=binary;
		int i=0;
		int decimal =0;
		while(binary>0) {
			int rem = binary%10;
			decimal = decimal+rem*(int)Math.pow(2, i);
			i++;
			binary/=10;
		}
		System.out.println("Binary:"+temp);
		System.out.println("Decimal:"+decimal);
	}

}
