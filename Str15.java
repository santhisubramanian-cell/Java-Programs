package string;
import java.util.Scanner;
public class Str15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		scan.nextLine();
		
		for(int i=1;i<=n;i++) {
			String str = scan.nextLine().toLowerCase();
			
			String res = str.replaceAll("[^a-z0-9]", "");
			
			String res1 = res.replaceAll("\\s+","");
			
			System.out.println(i + "." + res1.trim());
			
			
			
		}

	}

}
