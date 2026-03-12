package string;
import java.util.*;

import java.util.Scanner;

public class Str20 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String camel = scan.nextLine();

		int len = camel.length();
		String res = "";

		for(int i = 0; i < len; i++) {
			char ch = camel.charAt(i);

			if(Character.isUpperCase(ch)) {
				res += Character.toLowerCase(ch)+ "_" ;
			}
			else {
				res += ch;
			}
		}

		System.out.println(res);
	}
}
