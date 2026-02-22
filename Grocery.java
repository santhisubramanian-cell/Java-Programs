package javaprograms;
import java.util.Scanner;

public class Grocery {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double sales = scan.nextDouble();
        double discount = scan.nextDouble();
        double gst = scan.nextDouble();
        double finalRevenue = sales - (sales * discount / 100) + (sales * gst / 100);
        System.out.println("Final Revenue = " + (int)finalRevenue);
    }
}

