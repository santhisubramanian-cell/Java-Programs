import java.util.Scanner;
public class Missingnumber {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int size = scan.nextInt();
        int sum=0;
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i]=scan.nextInt();
            sum+=arr[i];
        }
        int n= size+1;
        int ans1 = n*(n+1)/2;
        int ans2 = ans1-sum;
        System.out.println(ans2);


        
    }
}
