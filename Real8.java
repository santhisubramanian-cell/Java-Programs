package ifelse;
import java.util.Scanner;
public class Real8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String tier = scan.nextLine();
		int square = scan.nextInt();
		int age = scan.nextInt();
		int score = scan.nextInt();
		
		
		double base = 0;
		int percentage = 0;
		double amenity = 0;
		String category = "";
		
		if(tier.equals("Prime")) {
			base=400;
		}
		else if(tier.equals("Urban")) {
			base=300;
		}
		else if(tier.equals("Suburban")) {
			base=180;
		}
		else if(tier.equals("Rural")) {
			base=100;
		}
		if(age>=0 && age<=5) {
			percentage=0;
		}
		else if(age>=6 && age<=15) {
			percentage=10;
		}
		else if(age>=16 && age<=30) {
			percentage=20;
		}
		else if(age>=31) {
			percentage=35;
		}
		double basevalue = square*base;
		if(score>=80 && score<=100) {
			amenity=basevalue*0.10;
		}
		else if(score>=60 && score<=79) {
			amenity=basevalue*0.05;
		}
		else if(score>=40 && score<=59) {
			amenity=basevalue*0.02;
		}
		else if(score<40) {
			amenity=basevalue*0;
		}
		double adjustedvalue = basevalue*(1+percentage/100);
		double finalvalue = adjustedvalue+amenity;
		if(tier.equals("Prime") || tier.equals("Urban") && age<=15) {
			category="Hot";
		}
		else if(tier.equals("Suburban")) {
			category="Stable";
		}
		else if(tier.equals("Rural") || age>=30) {
			category="Slow";
		}
		System.out.println("Location Tier: "+tier);
		System.out.println("Square: "+square);
		System.out.println("Property age: "+age);
		System.out.println("Amenity: "+score);
		System.out.println("Base: "+base);
		System.out.println("Age Adjustment: "+percentage+"%");
		System.out.println("Amenity Bonus: "+adjustedvalue);
		System.out.println("Property value: "+finalvalue);
		System.out.println("Market Category: "+category);
	}

}
