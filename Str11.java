package string;
import java.util.Scanner;
public class Str11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		scan.nextLine();
		
		for(int i=1;i<=n;i++) {
			String  str = scan.nextLine();
			

			String res = str.replace("'", "''");
			System.out.println(str + "->" + res);
			
		}
		

	}

}
