import java.util.Scanner;
public class largest_array {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i]=scan.nextInt();
        }

        int largest = 0;

        for(int i=0;i<n;i++){
            if(a[i]>largest){
                largest=a[i];
            }
        }
        System.out.print(largest);
    }
}
