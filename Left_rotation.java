import java.util.Scanner;
public class Left_rotation{
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int n= scan.nextInt();
        int[] a = new int[n];

        for(int i=0;i<n;i++){
            a[i]=scan.nextInt();
        }
        int k = scan.nextInt();
        k = k%n;
        for(int i=0;i<k;i++){
            int n1 = a[i];
            for(int j=0;j<n-1;j++){
                a[j]=a[j+1];
            }
            a[n-1]=n1;
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}