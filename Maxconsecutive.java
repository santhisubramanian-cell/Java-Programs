import java.util.Scanner;

public class Maxconsecutive {
    public static int max(int[] a){
        int max=0;
        int c=0;
        for(int each : a){
            if(each == 1){
                c++;
                max = Math.max(max,c);
            }
            if(each!=1){
                c=0;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i]=scan.nextInt();
        }
        int res = max(a);
        System.out.print(res);
    }
}
