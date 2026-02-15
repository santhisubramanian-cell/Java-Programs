package javaprograms;
import java.util.Scanner;
public class Billing {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float baseCost = scan.nextInt();
        float extraGB = scan.nextInt();
        float ratePerGB = scan.nextInt();
        float taxamt = scan.nextInt();
        float total = baseCost+(extraGB*ratePerGB);
        float finalamt=total+(taxamt/100);
        System.out.println(finalamt);

	}

}
