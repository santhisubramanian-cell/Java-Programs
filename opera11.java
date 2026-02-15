package operators;
import java.util.Scanner;
public class opera11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int box = scan.nextInt();
		int level = scan.nextInt();
		int capacity = box<<level;
		System.out.println(capacity);

	}

}
