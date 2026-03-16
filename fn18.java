package functions;
import java.util.*;
public class fn18 {
	public static void binary(int[] a, int target,int s) {
		int index=-1;
		
		for(int i=0;i<s;i++) {
			if(a[i] == target) {
				index = i;
				break;
			}
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int s = scan.nextInt();
		
		int[] a = new int[s];
		
		for(int i=0;i<s;i++) {
			a[i]=scan.nextInt();
		}
		
		int target = scan.nextInt();
		
		binary(a,target,s);

	}

}
