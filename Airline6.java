package ifelse;
import java.util.Scanner;

public class Airline6 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String bookclass = scan.nextLine();
        int day = scan.nextInt();
        double seat = scan.nextDouble();
        scan.nextLine();
        String route = scan.nextLine();
        double baseamt = 0;
        double mul = 1.0;
        String category = null;
        if (bookclass.equals("Economy")) {
            if (route.equals("Domestic")) {
                baseamt = 200;
            } else if (route.equals("Int-Short")) {
                baseamt = 500;
            } else if (route.equals("Int-Long")) {
                baseamt = 800;
            }
        } else if (bookclass.equals("Business")) {
            if (route.equals("Domestic")) {
                baseamt = 600;
            } else if (route.equals("Int-Short")) {
                baseamt = 1500;
            } else if (route.equals("Int-Long")) {
                baseamt = 2500;
            }
        } else if (bookclass.equals("First")) {
            if (route.equals("Domestic")) {
                baseamt = 1000;
            } else if (route.equals("Int-Short")) {
                baseamt = 3000;
            } else if (route.equals("Int-Long")) {
                baseamt = 5000;
            }
        }
        if (seat < 30 && day < 14) {
            mul = 1.8;   
            category = "High Demand";
        } 
        else if (seat < 50 && day < 30) {
            mul = 1.5;
            category = "High Demand";
        } 
        else if ((seat < 60) || (day >= 30 && day <= 60)) {
            mul = 1.0;
            category = "Moderate";
        } 
        else if (seat >= 60 && day > 60) {
            mul = 0.8; 
            category = "Low Demand";
        }
        double finalprice = baseamt * mul;
        System.out.println("Booking class: " + bookclass);
        System.out.println("Days: " + day);
        System.out.println("Seat: " + seat + "%");
        System.out.println("Route: " + route);
        System.out.println("Base price: " + baseamt);
        System.out.println("Multiplier: " + mul + "x");
        System.out.println("Final Amt: " + finalprice);
        System.out.println("Category: " + category);

   
    }
}
