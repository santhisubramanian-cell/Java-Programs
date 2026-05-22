import java.util.Scanner;
public class reverse_array {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int s = scan.nextInt();
        int[] arr = new int[s];

        for(int i=0;i<arr.length;i++){
            arr[i]=scan.nextInt();
        }

        int i=0;
        int j = arr.length-1;

        while(i<j){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }

        for(int k=0;k<arr.length;k++){
            System.out.println(arr[k]);
        }
        
    }
}
