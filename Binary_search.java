import java.util.Scanner;
public class Binary_search {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        int low = 0;
        int high = arr.length-1;
        int mid = low + (high-low)/2;
        int target = scan.nextInt();
        int index =-1;

        for(int i=0;i<n;i++){
            if(arr[mid] == target){
                System.out.println("Element is found.");
            }
            else if(arr[mid]<target){
                low = mid+1;
            }
            else if(arr[mid]>target){
                high = mid-1;
            }
        }
        System.out.println("Element is not found");
    }
}
