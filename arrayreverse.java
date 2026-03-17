package practice;

import java.util.*;
public class arrayreverse {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int size = scan.nextInt();
		
		int[] a = new int[size];
		
		for(int i=0;i<size;i++) {
			a[i]=scan.nextInt();
		}
		
		for(int i=size-1;i>=0;i--) {
			System.out.print((a[i])+" ");
		}
	}

}
