package functions;
import java.util.Scanner;
public class fn14 {
	public static int count(String str) {
		int n = str.length();
		int count=0;
		for(int i=0;i<n;i++) {
			if(str.charAt(i) >='A' && str.charAt(i)<='Z') {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String str = scan.nextLine();
		
		int res = count(str);
		
		
		System.out.println(res);
		
		
	}

}
