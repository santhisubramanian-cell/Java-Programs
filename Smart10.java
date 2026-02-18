package ifelse;
import java.util.Scanner;
public class Smart10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String timeOfDay = scan.nextLine();
		double powerconsumption = scan.nextDouble();
		double renewablepercentage = scan.nextDouble();
		scan.nextLine();
		String rateTier = scan.nextLine();
		String recommendation="";
		double baserate=0;
		double ratemul = 0;
		double poten=0;
		if(rateTier.equals("Basic")) {
			baserate = 0.18;
		}
		else if(rateTier.equals("Time-of-Use")) {
			baserate=0.15;
		}
		else if(rateTier.equals("Premium-Green")) {
			baserate=0.12;
		}
		if(timeOfDay.equals("Peak")) {
			if(powerconsumption>50) {
				ratemul=1.5;
			}
			else {
				ratemul=1.8;
			}
		}
		if(timeOfDay.equals("Off-Peak")) {
			if(powerconsumption>50) {
				ratemul=0.8;
			}
			else {
				ratemul=1.0;
			}
		}
		if(timeOfDay.equals("Super-Off-Peak")) {
			if(powerconsumption>50) {
				ratemul=0.5;
			}
			else {
				ratemul=0.6;
			}
		}
		double renewablecredit = (powerconsumption*renewablepercentage/100.0)*baserate;
		double cost = (powerconsumption*baserate*ratemul)-renewablecredit;
		if(timeOfDay.equals("Peak") && renewablepercentage<30) {
			recommendation="Shift to Off-Peak";
		}
		else if(renewablepercentage>=50) {
			recommendation="Excellent! Continue";
		}
		else if(timeOfDay.equals("Basic") && renewablepercentage>60) {
			recommendation="Upgrade to Time-of-Use";
		}
		else {
			recommendation="Good timing! Consider increasing renewable capacity";
		}
		if(timeOfDay.equals("peak")) {
			double offpeakmul = 0.8;
			double offpeakcost = (powerconsumption*baserate*ratemul)-renewablecredit;
			poten = cost-offpeakcost;
		}
		System.out.println("Time of Day: "+timeOfDay);
		System.out.println("Power Consumption: "+powerconsumption);
		System.out.println("Renewable Energy: "+renewablepercentage);
		System.out.println("Rate Tier: "+rateTier);
		System.out.println("Base Rate: "+baserate);
		System.out.println("Rate Multiplier: "+ratemul);
		System.out.println("Renewable Credit: "+renewablecredit);
		System.out.println("Total Cost: "+cost);
		System.out.println("Optimization Recommendation: "+recommendation);
		
		System.out.println("Potential Savings: "+poten);
		
		
		
		
	}

}
