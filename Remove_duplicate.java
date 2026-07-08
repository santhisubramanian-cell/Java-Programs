import java.util.Scanner;
public class Remove_duplicate {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();

    int[] arr = new int[n];
    for(int i=0;i<n;i++){
        arr[i]=scan.nextInt();
    }
    int j=0;
    for(int i=1;i<n;i++){
        if(arr[i]!=arr[j]){
            j++;
            arr[j]=arr[i];
        }
        
    }
    for(int i=0;i<=j;i++){
        System.out.print(arr[i]+" ");
    }
    }
}
