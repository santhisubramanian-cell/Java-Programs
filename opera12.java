package operators;
import java.util.Scanner;
public class opera12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int file = scan.nextInt();
		int cycle = scan.nextInt();
		int size = file>>cycle;
		System.out.println(size);
	}

}
