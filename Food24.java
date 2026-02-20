package ifelse;
import java.util.Scanner;
public class Food24 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double distancemiles = scan.nextDouble();
		double ordervalue = scan.nextDouble();
		scan.nextLine();
		String timeslot = scan.nextLine();
		String weathercondition = scan.nextLine();
		
		double basefee = 3.00;
		double distancesurcharge = distancemiles*1.00;
		double peakcharge = 0;
		
		if(timeslot.equals("Breakfast")) {
			peakcharge=0.0;
		}
		else if(timeslot.equals("Lunch")) {
			peakcharge=2.50;
		}
		else if(timeslot.equals("Dinner")) {
			peakcharge=2.00;
		}
		else if(timeslot.equals("Late-Night")) {
			peakcharge=1.50;
		}
		double weathersurcharge = 0.0;
		if(weathercondition.equals("Clear")) {
			weathersurcharge=0.0;
		}
		else if(weathercondition.equals("Rain")) {
			weathersurcharge=2.0;
		}
		else if(weathercondition.equals("Snow")) {
			weathersurcharge=3.0;
		}
		else if(weathercondition.equals("Storm")) {
			weathersurcharge=5.0;
		}
		double ordervaluediscount =0;
		if(ordervalue>=75) {
			ordervaluediscount=5.0;
		}
		else if(ordervalue>=50) {
			ordervaluediscount=3.0;
		}
		else if(ordervalue>=30) {
			ordervaluediscount=1.0;
		}
		double finalfee = basefee+distancesurcharge+peakcharge+weathersurcharge-ordervaluediscount;
		if(finalfee<2.99) {
			finalfee=2.99;
		}
		
		int basetime = (int)distancemiles*8;
		
		if(timeslot.equals("Lunch") || timeslot.equals("Dinner")) {
			basetime+=10;
		}
		if(weathercondition.equals("Rain")) {
			basetime+=5;
		}
		else if(weathercondition.equals("Snow")) {
			basetime+=10;
		}
		if(weathercondition.equals("Storm")) {
			basetime+=15;
		}
		String priority ="";
		
		if(ordervalue>60) {
			priority="Express";
		}
		else if(timeslot.equals("Dinner") || timeslot.equals("Lunch")) {
			priority="High";
		}
		else {
			priority="Standard";
		}
		System.out.println("Delivery Distance: "+distancemiles);
		System.out.println("Order Value: "+ordervalue);
		System.out.println("Time Slo: "+timeslot);
		System.out.println("Weather Condition: "+weathercondition);
		System.out.println("Base Delivery Fee: "+basefee);
		System.out.println("Distance Surcharge: "+distancesurcharge);
		System.out.println("Peak Time Surcharge: "+peakcharge);
		System.out.println("Weather Surcharge: "+weathersurcharge);
		System.out.println("Order Value Discount: "+ordervaluediscount);
		System.out.println("Final Delivery Fee: "+finalfee);
		System.out.println("Estimated Delivery Time: "+basetime);
		System.out.println("Service Priority: "+priority);


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
