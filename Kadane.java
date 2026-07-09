import java.util.Scanner;
public record Kadane() {
    public static int kadanes(int a[]){
        int c =0;
        int max = Integer.MIN_VALUE;
        for(int each : a){
            c+=each;
            if(c>max){
                max=c;
            }
            if(c<0){
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
        int res = kadanes(a);
        System.out.print(res);
    }
}
