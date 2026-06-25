import java.util.Scanner;
public class Allzeroend {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int size = scan.nextInt();
        int[] a = new int[size];
        for(int i=0;i<size;i++){
            a[i]=scan.nextInt();
        }
        int index=0;
        for(int i=0;i<size;i++){
            if(a[i]!=0){
                a[index]=a[i];
                index++;
            }
        }
        while(index<size){
            a[index]=0;
            index++;

        }
        for(int i=0;i<size;i++){
            System.out.print(a[i]+" ");
        }
    }
}
