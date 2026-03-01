package forloop;
import java.util.Scanner;

public class For14 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        scan.nextLine(); 

        int count = 0;
        double totalfine = 0;

        for (int i = 1; i <= n; i++) {

            String booktype = scan.nextLine();
            int dayslate = scan.nextInt();
            scan.nextLine(); 

            double finerate = 0;
            double finecap = 0;

            if (booktype.equals("Regular")) {
                finerate = 0.50;
                finecap = 10;
            } 
            else if (booktype.equals("Reference")) {
                finerate = 1.00;
                finecap = 20;
            } 
            else if (booktype.equals("Magazine")) {
                finerate = 0.25;
                finecap = 5;
            }

            double fine = dayslate * finerate;
            double actualfine = Math.min(fine, finecap);

            if (dayslate > 0) {
                count++;
            }

            totalfine += actualfine;

            System.out.println("Book: " + booktype);
            System.out.println("Days late: " + dayslate);
            System.out.println("Daily Fine: " + finerate);
            System.out.println("Calculated fine: " + fine);
            System.out.println("Actual fine: " + actualfine);
            System.out.println("Cap applied: " + (fine > finecap ? "Yes" : "No"));
            System.out.println();
        }

        double avg = totalfine / n;

        System.out.println("Total books: " + n);
        System.out.println("Fine collected: " + totalfine);
        System.out.println("Books overdue: " + count);
        System.out.println("Average fine per book: " + avg);

        scan.close();
    }
}