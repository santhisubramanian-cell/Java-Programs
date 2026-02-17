package ifelse;
import java.util.Scanner;
public class Health3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int age = scan.nextInt();
		scan.nextLine();
		String status = scan.nextLine();
		String condition = scan.nextLine();
		String tier = scan.nextLine();
		double base=0;
		double risk=0;
		
		if(age>=18 && age<=30) {
			if(tier.equals("Basic")) {
				base=200;
			}
			if(tier.equals("Standard")) {
				base=300;
			}
			if(tier.equals("Premium")) {
				base=500;
			}
		}
		else if(age>=31 && age<=50) {
			if(tier.equals("Basic")) {
				base=250;
			}
			if(tier.equals("Standard")) {
				base=350;
			}
			if(tier.equals("Premium")) {
				base=600;
			}
		}
		else if(age>=51 && age<=65) {
			if(tier.equals("Basic")) {
				base=350;
			}
			if(tier.equals("Standard")) {
				base=450;
			}
			if(tier.equals("Premium")) {
				base=700;
			}
		}
		else if(age>=66) {
			if(tier.equals("Basic")) {
				base=400;
			}
			if(tier.equals("Standard")) {
				base=550;
			}
			if(tier.equals("Premium")) {
				base=800;
			}
		}
		boolean smoker = status.equals("Smoker");
		boolean hascondition = condition.equals("Yes");
		if(smoker && hascondition) {
			risk=base*0.70;
		}
		else if(smoker) {
			risk=base*0.40;
		}
		else if(hascondition) {
			risk = base*30;
		}
		else {
			risk=0;
		}
		double total = base+risk;
		System.out.println("Age:"+age);
		System.out.println("Status"+status);
		System.out.println("condition"+condition);
		System.out.println("Tier"+tier);
		System.out.println("Base"+base);
		System.out.println("Risk"+risk);
		System.out.println("Total Premium"+total);
	}

}
