package string;
import java.util.Scanner;
public class Str18 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String str = scan.nextLine();
		
		System.out.println("Original:"+str);
		
		int len = str.length();
		char newchar = 0;
		System.out.print("Encrypted:");
		for(int i=0;i<len;i++) {
			if(str.charAt(i)>='A' && str.charAt(i)<='Z') {
				newchar = (char) ((str.charAt(i)-'A'+4)%26+'A');
				System.out.print(newchar);
			}
			else if(str.charAt(i)>='a' && str.charAt(i)<='z') {
				newchar = (char) ((str.charAt(i)-'a'+4)%26+'a');
				System.out.print(newchar);
			}
			
			
		}

	}

}
