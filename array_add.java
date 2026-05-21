import java.util.Arrays;
import java.util.Scanner;
public class array_add{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int s = scan.nextInt();
        int[] arr = new int[s];
        int[] arr1 = new int[s];

        for(int i=0;i<s;i++){
            arr[i]=scan.nextInt();

        }
        
        for(int i=0;i<s;i++){
            int num = arr[i];
            int sum=0;
            while(num !=0){
                int rem = num%10;
                sum = sum+rem;
                num=num/10;
            }
            arr1[i]=sum;

        }
        for(int i=0;i<s;i++){
            System.out.print(arr1[i]+" ");
        }
    }
}