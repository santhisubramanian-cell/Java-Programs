package practice;
import java.util.*;
public class removeduplicate {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int s = scan.nextInt();
		
		int[] a = new int[s];
		
		for(int i=0;i<s;i++) {
			a[i]=scan.nextInt();
		}
		
		for(int i=0;i<s;i++) {
			boolean flag = false;
			for(int j=0;j<i;j++) {
				if(a[i] == a[j]) {
					flag = true;
					break;
				}
			}
			if(!flag) {
				System.out.print(a[i]+" ");
			}
		}
		
	}

}
