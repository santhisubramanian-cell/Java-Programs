package javaprograms;
import java.util.Scanner;
public class Basic12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int ticketRevenue = scan.nextInt();
		int snack = scan.nextInt();
		int mainten = scan.nextInt();
		int electri = scan.nextInt();
		int a = ticketRevenue+snack-mainten-electri;
		System.out.println(a);
		

	}

}
