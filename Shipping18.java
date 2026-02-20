package ifelse;
import java.util.Scanner;
public class Shipping18 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double packageweight = scan.nextDouble();
		scan.nextLine();
		String destinationzone  = scan.nextLine();
		String shippingspeed = scan.nextLine();
		String packagesize = scan.nextLine();
		
		double baseRate;
        String serviceLevel;
        if (shippingspeed.equals("Economy")) {
            baseRate = 5.0;
            serviceLevel = "Budget";
        } else if (shippingspeed.equals("Standard")) {
            baseRate = 10.0;
            serviceLevel = "Standard";
        } else if (shippingspeed.equals("Express")) {
            baseRate = 25.0;
            serviceLevel = "Priority";
        } else { 
            baseRate = 50.0;
            serviceLevel = "Premium";
        }

        
        double weightSurcharge = packageweight * 1.0;

        
        double zoneMultiplier;
        if (destinationzone.equals("Local")) {
            zoneMultiplier = 1.0;
        } else if (destinationzone.equals("Regional")) {
            zoneMultiplier = 1.2;
        } else if (destinationzone.equals("National")) {
            zoneMultiplier = 1.5;
        } else { 
            zoneMultiplier = 3.0;
        }

        
        double sizeSurcharge;
        if (packagesize.equals("Small")) {
            sizeSurcharge = 0.0;
        } else if (packagesize.equals("Medium")) {
            sizeSurcharge = 5.0;
        } else if (packagesize.equals("Large")) {
            sizeSurcharge = 15.0;
        } else { 
            sizeSurcharge = 30.0;
        }
        double baseCost = (baseRate + weightSurcharge) * zoneMultiplier;
        double totalCost = baseCost + sizeSurcharge;
        int deliveryDays = 0;

        if (shippingspeed.equals("Economy")) {
            if (destinationzone.equals("Local")) {
                deliveryDays = 7;  
            } else if (destinationzone.equals("Regional")) {
                deliveryDays = 7;
            } else if (destinationzone.equals("National")) {
                deliveryDays = 7;
            } else {
                deliveryDays = 14;
            }
        } else if (shippingspeed.equals("Standard")) {
            if (destinationzone.equals("Local")) {
                deliveryDays = 3;
            } else if (destinationzone.equals("Regional")) {
                deliveryDays = 5;
            } else if (destinationzone.equals("National")) {
                deliveryDays = 7;
            } else {
                deliveryDays = 10;
            }
        } else if (shippingspeed.equals("Express")) {
            if (destinationzone.equals("Local")) {
                deliveryDays = 1;
            } else if (destinationzone.equals("Regional")) {
                deliveryDays = 2;
            } else if (destinationzone.equals("National")) {
                deliveryDays = 2;
            } else {
                deliveryDays = 3;
            }
        } else { 
            deliveryDays = 1;
        }
        System.out.println("Package Weight: " + packageweight + " lbs");
        System.out.println("Destination Zone: " + destinationzone);
        System.out.println("Shipping Speed: " + shippingspeed);
        System.out.println("Package Size: " + packagesize);
        System.out.println("Base Shipping Rate: $" + baseRate);
        System.out.println("Weight Surcharge: $" + weightSurcharge);
        System.out.println("Zone Multiplier: " + zoneMultiplier + "x");
        System.out.println("Size Surcharge: $" + sizeSurcharge);
        System.out.println("Total Shipping Cost: $" +(totalCost * 100.0) / 100.0);
        System.out.println("Estimated Delivery: " + deliveryDays + " business days");
        System.out.println("Service Level: " + serviceLevel);

		
		
		

	}

}
