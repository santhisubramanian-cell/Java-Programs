import java.util.Scanner;
public class Linear_search{
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }

        int target = scan.nextInt();
        int index =-1;


        for(int i=0;i<n;i++){
            if(arr[i] == target){
                index = i+1;
            }
        }
        System.out.println(index);
    }
}