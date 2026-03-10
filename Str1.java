package string;
import java.util.Scanner;
public class Str1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int valid =0,invalid=0;
		
		for(int i=1;i<=n;i++) {
			String str = scan.nextLine();
			boolean isvalid=true;
			
			int at = str.indexOf('@');
			int lastat = str.lastIndexOf('@');
			int dot = str.lastIndexOf('.');
			
			if(str.startsWith(".") || at<=0 || at!=lastat || dot<at || str.endsWith(".")) {
				isvalid=false;
			}
			if(isvalid) {
				System.out.println(i + ". "+ str + "- valid");
				valid++;
			}
			else {
				System.out.println(i + ". " + str + "- invalid");
				invalid++;
			}
		}
		System.out.println("Total Valid:"+valid);
		System.out.println("Total InValid:"+invalid);
		
	}

}
