package functions;
import java.util.*;
public class fn2 {
	public static void even(int n) {
		boolean a = (n%2==0)? true : false;
		System.out.println(a);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		int n = scan.nextInt();
		
		even(n);

	}

}
