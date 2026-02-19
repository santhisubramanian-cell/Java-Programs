package ifelse;
import java.util.Scanner;
public class Vehicle12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int driveage = scan.nextInt();
		scan.nextLine();
		String vehicletype = scan.nextLine();
		String drivingrecord = scan.nextLine();
		String coveragelevel = scan.nextLine();
		
		double riskfactor=0;
		int basepremium =0;
		double agefactor =0;
		int recordadjust = 0;
		
		if(coveragelevel.equals("Basic")) {
			basepremium=500;
		}
		else if(coveragelevel.equals("Standard")) {
			basepremium=800;
		}
		else if(coveragelevel.equals("Comprehensive")) {
			basepremium=1500;
		}
		if(driveage>=15 && driveage<=21) {
			agefactor=1.8;
		}
		else if(driveage>=22 && driveage<=25) {
			agefactor=1.5;
		}
		else if(driveage>=26 && driveage<=40) {
			agefactor=1.0;
		}
		else if(driveage>=41 && driveage<=60) {
			agefactor=0.9;
		}
		else if(driveage>=61) {
			agefactor=1.1;
		}
		if(vehicletype.equals("Sedan")) {
			riskfactor=1.0;
		}
		else if(vehicletype.equals("SUV")) {
			riskfactor=1.2;
		}
		else if(vehicletype.equals("Sports")) {
			riskfactor=1.5;
		}
		else if(vehicletype.equals("Truck")) {
			riskfactor=1.1;
		}
		if(drivingrecord.equals("Clean")) {
			recordadjust-=10;
		}
		else if(drivingrecord.equals("Minor-Violations")) {
			recordadjust+=25;
		}
		else if(drivingrecord.equals("Major-Violations")) {
			recordadjust+=50;
		}
		double adjustedpremium = basepremium*agefactor*riskfactor;
		double finalpremium = adjustedpremium*(1+recordadjust/100.0);
		double monthlypremium = finalpremium/12.0;
		
		double ratio = finalpremium/basepremium;
		String risk="";
		
		if(ratio<=1.0) {
			risk="Low";
		}
		else if(ratio<=1.5) {
			risk="Moderate";
		}
		else if(ratio<2.5) {
			risk="High";
		}
		else {
			risk="Extreme";
		}
		
		
		System.out.println("Driver age: "+driveage);
		System.out.println("vehicle typr: "+vehicletype);
		System.out.println("driving record: "+drivingrecord);
		System.out.println("covearge level: "+coveragelevel);
		System.out.println("Base premium: "+basepremium);
		System.out.println("Age factor: "+agefactor);
		System.out.println("Risk factor: "+riskfactor);
		System.out.println("record: "+recordadjust);
		System.out.println("monthly premium "+monthlypremium);
		System.out.println("annual premium: "+finalpremium);
		System.out.println("risk category: "+risk);
		
		
		
		
		
		
		
		
		
		
		
	}

}
