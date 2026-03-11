package string;
import java.util.Arrays;
import java.util.Scanner;
public class Str8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		scan.nextLine();
		
		for(int i=1;i<=n;i++) {
			String s1 = scan.nextLine();
			String s2 = scan.nextLine();
			
			char[] a1 = s1.toCharArray();
			char[] a2 = s2.toCharArray();
			
			Arrays.sort(a1);
			Arrays.sort(a2);
			
			if(Arrays.equals(a1, a2)) {
				System.out.println(s1 + "&" + s2+ "-> Anagram");
			}
			else {
				System.out.println(s1 + "&" + s2+ "-> Not Anagram");
			}
		}

	}

}
