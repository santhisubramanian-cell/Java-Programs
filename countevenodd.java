package practice;
import java.util.Scanner;
public class countevenodd {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int size = scan.nextInt();
		int[] a = new int[size];
		
		for(int i=0;i<size;i++) {
			a[i]=scan.nextInt();
			
		}
		
		int even = 0;
		int odd = 0;
		
		for(int i=0;i<size;i++) {
			if(a[i]%2 ==0 ) {
				even ++;
			}
			else {
				odd++;
			}
		}
		System.out.println("even: "+even);
		System.out.println("odd: "+odd);
	}

}
