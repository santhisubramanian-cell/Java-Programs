import java.util.Scanner;
public class Binary_To_Deci{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int bin = scan.nextInt();
        int decimal =0;
        int base=1;
        while(bin>0){
            int rem = bin%10;
            decimal = decimal + rem*base;
            bin = bin/10;
            base*=2;
        }
        System.out.println(decimal);

    }
}