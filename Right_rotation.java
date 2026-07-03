import java.util.*;
public class Right_rotation {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i]=scan.nextInt();
        }
        int k = scan.nextInt();
        k = k%n;
        for(int i=0;i<k;i++){
            int last = a[n-1];
            for(int j=n-1;j>=0;j--){
                a[j]=a[j-1];
            }
            a[0]=last;
        }

        System.out.println(Arrays.toString(a));

    }
}
