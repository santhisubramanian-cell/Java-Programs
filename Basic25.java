package javaprograms;
import java.util.Scanner;
public class Basic25 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int resUsage = scan.nextInt();
		int resrate = scan.nextInt();
		int comUsage = scan.nextInt();
		int comrate = scan.nextInt();
		int connection = scan.nextInt();
		int penalty = scan.nextInt();
		int main = scan.nextInt();
		int treat = scan.nextInt();
		int a = (resUsage*resrate)+(comUsage*comrate)+connection+penalty-main-treat;
		System.out.println(a);
	
	}

}
