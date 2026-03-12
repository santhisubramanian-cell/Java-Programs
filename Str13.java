package string;
import java.util.Scanner;
public class Str13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		scan.nextLine();
		
		for(int i=1;i<=n;i++) {
			String s = scan.nextLine();
			System.out.print(i + "." + s + "->" );
			
			int len = s.length();
			
			for(int j=0;j<len;j++) {
				if(s.charAt(j)== 'T') {
					s=s.replace('T', 'U');
				}
				
			}
			System.out.println(s);
			
		}
		

	}

}
