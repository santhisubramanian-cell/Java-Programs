import java.util.Scanner;
public class Frequency{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];

        for(int i=0;i<n;i++){
            a[i]=scan.nextInt();
        }
        boolean[] a1 = new boolean[n];
        for(int i=0;i<n;i++){
            if(a1[i]){
                continue;
            }
            int count=1;
            for(int j=i+1;j<n;j++){
                if(a[i]==a[j]){
                    count++;
                    a1[j]=true;
                }
            }
            System.out.println(a[i]+"->"+count);

        }

    }
}