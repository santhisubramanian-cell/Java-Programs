package functions;
import java.util.Scanner;
public class fn8 {
	public static int wordcounter(String str) {
		int count=0;
		String[] word = str.split(" ");
		
		for(String num : word) {
			count++;
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String str = scan.nextLine();
		
		int res = wordcounter(str);
		System.out.println(res);

	}

}
