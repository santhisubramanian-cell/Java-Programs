import java.util.Scanner;
public class palindrome{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int rev =0;
        int original = n;

        while(n!=0){
            int rem = n%10;
            rev = rev*10+rem;
            n=n/10;

        }

        if(original == rev){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }

    }
}