package javaprograms;
import java.util.Scanner;
public class Scholarship {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int tuition = scan.nextInt();
		int scholar = scan.nextInt();
		int exam = scan.nextInt();
		int library = scan.nextInt();
		int discount = tuition*scholar/100;
		int pay = tuition-discount+exam+library;
		System.out.println(pay);

	}

}

