package string;
import java.util.*;
public class Str6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String str = scan.nextLine();
		
		str=str.toLowerCase().replace("[^a-z]", "");
		String[] word = str.split(" ");
		
		int unique=0;
		
		for(int i=0;i<word.length;i++) {
			int count=1;
			
			if(word[i].equals("visited")) {
				continue;
			}
			for(int j=i+1;j<word.length;j++) {
				if(word[i].equals(word[j])) {
					count++;
					word[j]="visited";
				}
			}
			System.out.println(word[i]+":"+count);
			unique++;
		}
		
		System.out.println("Total Unique Words: "+unique);
		
		
		
		

	}

}
