package functions;
import java.util.Scanner;
public class fn16 {
	public static void longestword(String str) {
		String longer ="";
		String[] words = str.split(" ");
		
		for(String word : words) {
			if(word.length()>longer.length()) {
				longer = word;
			}
		}
		System.out.println(longer);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String str = scan.nextLine();
		
		longestword(str);

	}

}
