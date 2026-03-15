package functions;
import java.util.Scanner;
public class fn12 {
	public static int countwords(String str, char ch) {
		int count=0;
		int n = str.length();
		for(int i=0;i<n;i++) {
			if(str.charAt(i) == ch) {
				count++;
			}
				
		}
		return count;
		
		
		
	}
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String str = scan.nextLine();
		
		char ch = scan.next().charAt(0);
		
		int res = countwords(str,ch);
		System.out.println(res);				
	}
	

}
