import java.util.Scanner;
public class merge_two_array{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        int[] a1  = new int[n];
        for(int i=0;i<n;i++){
            a1[i]=scan.nextInt();
        }
        int[] a2 = new int[n];
        for(int i=0;i<n;i++){
            a2[i]=scan.nextInt();
        }

        int[] a3 = new int[n+n];

        for(int i=0;i<n;i++){
            a3[i]=a1[i];
        }
        for(int j=0;j<n;j++){
            a3[n+j]=a2[j];
        }

        for(int i=0;i<n+n;i++){
            System.out.print(a3[i]+" ");
        }

    }
}