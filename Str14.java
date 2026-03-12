package string;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Str14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String str = scan.nextLine();
		
		int n = scan.nextInt();
		scan.nextLine();
		
		for(int i=1;i<=n;i++) {
			String line = scan.nextLine().toLowerCase();

			Pattern pattern = Pattern.compile("(?i)" + Pattern.quote(str));
	       
			Matcher matcher = pattern.matcher(line);

	        String result = matcher.replaceAll("<b>$0</b>");

	        System.out.println(i + ". " + result);

	}

}

}