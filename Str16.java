package string;
import java.util.Scanner;
public class Str16 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		scan.nextLine();
		int count=0;
		System.out.println("Critical Logs:");
		for(int i=1;i<=n;i++) {
			String line = scan.nextLine();
			int num=1;
			if(line.contains("ERROR") || line.contains("EXCEPTION")) {
				System.out.println(num + "." + line);
				count++;
	
				num++;
			}
			
			
			
		}
		System.out.println("Total Errors Found:"+count);
	}

}
