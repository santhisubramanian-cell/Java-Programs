import java.util.Scanner;
public interface Two_sum {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int target = scan.nextInt();
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==target){
                    System.out.print("[" + i + "," + j + "]");
                }
            }
        }
    }
}
