package ifelse;
import java.util.Scanner;

public class Restaurant11 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        
        String ordertype = scan.nextLine();
        String loyaltyStatus = scan.nextLine();
        double ordervalue = Double.parseDouble(scan.nextLine());
        String timeSlot = scan.nextLine();

        int basediscount = 0;
        int timebasedadjust = 0;
        double servicefee = 0;
        if (loyaltyStatus.equals("Gold")) {
            basediscount = 15;
        } else if (loyaltyStatus.equals("Silver")) {
            basediscount = 10;
        } else if (loyaltyStatus.equals("Bronze")) {
            basediscount = 5;
        } else {
            basediscount = 0;
        }
        if (timeSlot.equals("Late-Night")) {
            timebasedadjust = 5;  
        }
        if (ordertype.equals("Delivery")) {
            servicefee = ordervalue * 0.10;   
        } 
        else if (ordertype.equals("Takeout")) {
            servicefee = ordervalue * 0.03;  
        } 
        else if (ordertype.equals("Dine-In")) {
            servicefee = 0;
        }
        double discountedvalue = ordervalue * (1 - basediscount / 100.0);
        double adjustedvalue = discountedvalue * (1 + timebasedadjust / 100.0);
        double finalamt = adjustedvalue + servicefee;
        String Priority;
        if (timeSlot.equals("Peak")) {
            Priority = "High";
        } 
        else if (timeSlot.equals("Regular")) {
            Priority = "Medium";
        } 
        else {
            Priority = "Low";
        }
        int preptime = 0;

        if (ordertype.equals("Delivery")) {
            if (Priority.equals("High")) {
                preptime = 20;
            } else if (Priority.equals("Medium")) {
                preptime = 30;
            } else {
                preptime = 40;
            }
        } 
        else if (ordertype.equals("Takeout")) {
            if (Priority.equals("High")) {
                preptime = 15;
            } else if (Priority.equals("Medium")) {
                preptime = 20;
            } else {
                preptime = 25;
            }
        } 
        else if (ordertype.equals("Dine-In")) {
            if (Priority.equals("High")) {
                preptime = 25;
            } else if (Priority.equals("Medium")) {
                preptime = 30;
            } else {
                preptime = 35;
            }
        }
        System.out.println("Order Type: " + ordertype);
        System.out.println("Loyalty Status: " + loyaltyStatus);
        System.out.println("Order Value: " + ordervalue);
        System.out.println("Time Slot: " + timeSlot);
        System.out.println("Base Discount: " + basediscount + "%");
        System.out.println("Time Adjustment: " + timebasedadjust + "%");
        System.out.println("Service Fee: " + servicefee);
        System.out.println("Final Amount: " + finalamt);
        System.out.println("Kitchen Priority: " + Priority);
        System.out.println("Estimated Preparation Time: " + preptime + " minutes");

       
    }
}
