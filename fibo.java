 import java.util.Scanner;
 public class fibo{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a = 0;
        int b = 1;
        System.out.print(a + " " + b + " ");
        for(int i=2;i<=n;i++){
            int c = a+b;
            a=b;
            b=c;
            System.out.print(c+" ");
        }

        

    }
 }
