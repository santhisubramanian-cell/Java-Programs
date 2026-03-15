package functions;
import java.util.*;
public class fn13 {
	public static void removespace(String str) {
		int n = str.length();
		String res ="";
		for(int i=0;i<n;i++) {
			if(str.charAt(i)!= ' ') {
				res+=str.charAt(i);
			}
			
		}
		System.out.println(res);
	}


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String str = scan.nextLine();
		
		removespace(str);
	}

}
