import java.util.Arrays;
import java.util.Scanner;
public class Pro_self{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i]=scan.nextInt();
        }
        int[] res = new int[n];
        int product;
        for(int i=0;i<n;i++){
            product=1;
            for(int j=0;j<n;j++){
                if(a[i]!=a[j]){
                    product = product*a[j];
                }
            }
            res[i]=product;
        }
        System.out.print(Arrays.toString(res));
        
    }
}