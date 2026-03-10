package string;
import java.util.Scanner;

public class Str4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		scan.nextLine();
		System.out.println("DNA Sequence Analysis:");
		
		for(int i=1;i<=n;i++) {
			String s = scan.nextLine();
			
			String rev = "";
			int len = s.length();
			for(int j=len-1;j>=0;j--) {
				rev=rev+s.charAt(j);
			}
			if(s.equalsIgnoreCase(rev)) {
				System.out.println(s +"- Plaindrome");
			}
			else {
				System.out.println(s +" - Not Palindrome");
			}
			
		}

	}

}
