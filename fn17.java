package functions;
import java.util.Scanner;
public class fn17 {
	public static void sorted(String str) {
		int n = str.length();
		char[] ch = str.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]>ch[j]) {
					char temp = ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
					
				}
			}
		}
		System.out.println(ch);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String str = scan.nextLine();
		
		sorted(str);

	}

}
