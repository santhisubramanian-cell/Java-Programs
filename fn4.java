package functions;
import java.util.Scanner;
public class fn4 {
	public static String isPalindrome(String str) {
		int len = str.length();
		String rev = "";
		
		for(int i=len-1 ;i>=0;i--) {
			rev += str.charAt(i);
		}
		return rev;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String str = scan.nextLine();
		
		String res = isPalindrome(str);
		
		if(res.equalsIgnoreCase(str)) {
			System.out.println("Paindrome");
		}
		else {
			System.out.println("Not Paindrome");
		}

	}

}
