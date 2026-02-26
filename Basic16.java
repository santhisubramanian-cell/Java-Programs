package javaprograms;
import java.util.Scanner;
public class Basic16 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int genPass = scan.nextInt();
		int genfare = scan.nextInt();
		int acPass = scan.nextInt();
		int acfare = scan.nextInt();
		int platform = scan.nextInt();
		int maintenance = scan.nextInt();
		int fuel = scan.nextInt();
		int value = (genPass*genfare)+(acPass*acfare)+platform-maintenance-fuel;
		System.out.println(value);
		

	}

}



