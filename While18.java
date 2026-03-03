package whiledowhile;
import java.util.Scanner;
public class While18 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
	    int b = scan.nextInt();
	    
	    int num1=a;
	    int num2=b;
	    
	    while(num2!=0) {
	    	int temp = num2;
	    	num2=num1%num2;
	    	num1=temp;
	    }
	    int lcm = a*b/num1;
	    System.out.println("LCM of "+a+"and "+b+"= "+lcm);
	}

}
