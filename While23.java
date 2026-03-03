package whiledowhile;
import java.util.Scanner;
public class While23 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String s = scan.next();
		int count =0;
		int i=0;
		String text = s.toLowerCase();
				
		if(text.length()>0) {
			do {
				char ch = text.charAt(i);
				if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u') {
					count++;
				}
				i++;
			}
			while(i<text.length());
			System.out.println("Text:"+s);
			System.out.println("Vowel count:"+count);
		}
	}

}
