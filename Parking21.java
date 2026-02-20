package ifelse;
import java.util.Scanner;
public class Parking21 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		String locationZone = sc.nextLine();
		double parkingHours = sc.nextDouble();
        sc.nextLine(); 
        String vehicleType = sc.nextLine();
        String membershipStatus = sc.nextLine();
        double baseRate = 5.00;
        double zonePremium = 0;
        double vehicleSurcharge = 0;
        double membershipDiscount = 0;
        double dailyCap = Double.MAX_VALUE;
        boolean dailyCapApplied = false;
        if (locationZone.equals("Downtown")) {
            zonePremium = 50;
            dailyCap = 150;
        } else {
            if (locationZone.equals("Business-District")) {
                zonePremium = 30;
                dailyCap = 120;
            } else {
                if (locationZone.equals("Residential")) {
                    zonePremium = 0;
                    dailyCap = 60;
                } else {
                    if (locationZone.equals("Airport")) {
                        zonePremium = 100;
                        dailyCap = 180;
                    }
                }
            }
        }
        if (vehicleType.equals("Motorcycle")) {
            vehicleSurcharge = -2;
        } else {
            if (vehicleType.equals("Compact")) {
                vehicleSurcharge = 0;
            } else {
                if (vehicleType.equals("Sedan")) {
                    vehicleSurcharge = 0;
                } else {
                    if (vehicleType.equals("SUV")) {
                        vehicleSurcharge = 3;
                    } else {
                        if (vehicleType.equals("Oversized")) {
                            vehicleSurcharge = 5;
                        }
                    }
                }
            }
        }

        if (membershipStatus.equals("None")) {
            membershipDiscount = 0;
        } else {
            if (membershipStatus.equals("Monthly")) {
                membershipDiscount = 20;
            } else {
                if (membershipStatus.equals("Annual")) {
                    membershipDiscount = 25;
                } else {
                    if (membershipStatus.equals("VIP")) {
                        membershipDiscount = 30;
                    }
                }
            }
        }

        double calculatedFee = (baseRate * (1 + zonePremium / 100.0) + vehicleSurcharge) * parkingHours;
        double discountedFee = calculatedFee * (1 - membershipDiscount / 100.0);
        if (parkingHours >= 24) {
            if (discountedFee > dailyCap) {
                discountedFee = dailyCap;
                dailyCapApplied = true;
            }
        }
        System.out.println("Location Zone: " + locationZone);
        System.out.println("Parking Duration: " + parkingHours + " hours");
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Membership Status: " + membershipStatus);
        System.out.println("Base Hourly Rate: $" + String.format("%.2f", baseRate));
        System.out.println("Zone Premium: " + zonePremium + "%");
        System.out.println("Vehicle Size Surcharge: $" + vehicleSurcharge);
        System.out.println("Membership Discount: " + membershipDiscount + "%");
        System.out.println("Total Parking Fee: $" + String.format("%.2f", discountedFee));
        System.out.println("Daily Cap Applied: " + (dailyCapApplied ? "Yes" : "No"));

        
    
}
		       

		        
		        
}