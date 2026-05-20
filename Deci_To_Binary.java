import java.util.Scanner;
public class Deci_To_Binary{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int deci = scan.nextInt();

        String bina = "";
        while(deci>0){
            int rem = deci%2;
            bina = bina + rem;
            deci = deci/2;
        }
        System.out.println(bina);
    }
}