package string;
import java.util.Scanner;
public class Str3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String str = scan.nextLine();
		
		System.out.println("original:"+str);
		int count=1;
		for(int i=0;i<str.length();i++) {
			if(i<str.length()-1 && str.charAt(i)== str.charAt(i+1)) {
				count++;
			}
			else {
				System.out.print(str.charAt(i)+""+count);
				count=1;
			}
		}

	}

}
