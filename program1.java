package ifelse;
import java.util.Scanner;

public class program1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int performance = scan.nextInt();
        int year = scan.nextInt();
        scan.nextLine();
        String dept = scan.nextLine();
        double base = scan.nextDouble();
        double percentage = 0;
        String status;
        if (performance >= 3) {
            status = "Eligible";
            if (dept.equalsIgnoreCase("critical")) {
                if (performance == 5 && year >= 5) {
                    percentage = 25;
                } 
                else if (performance == 4 && year >= 10) {
                    percentage = 22;
                } 
                else if (performance == 4) {
                    percentage = 15;
                } 
                else if (performance == 3) {
                    percentage = 10;
                }

            } else {

                if (performance == 5) {
                    percentage = 18;
                } 
                else if (performance == 4) {
                    percentage = 12;
                } 
                else if (performance == 3) {
                    percentage = 8;
                }
            }
            double bonus = base * (percentage / 100);
            System.out.println("Performance Rating: " + performance);
            System.out.println("Years of Service: " + year);
            System.out.println("Department: " + dept);
            System.out.println("Bonus Percentage: " + percentage + "%");
            System.out.println("Bonus Amount: $" + bonus);
            System.out.println("Status: " + status);

        } else {
            System.out.println("Performance Rating: " + performance);
            System.out.println("Years of Service: " + year);
            System.out.println("Department: " + dept);
            System.out.println("Bonus Percentage: 0%");
            System.out.println("Bonus Amount: $0.0");
            System.out.println("Status: Not Eligible");
        }
    }
}
