package javaprograms;
import java.util.Scanner;
public class Hospital {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int roomCharge = scan.nextInt();
		int days = scan.nextInt();
		int medicine = scan.nextInt();
		int lab = scan.nextInt();
		int insurance = scan.nextInt();
		int a = (roomCharge*days)+medicine+lab-insurance;
		System.out.println(a);
		
		

	}

}
