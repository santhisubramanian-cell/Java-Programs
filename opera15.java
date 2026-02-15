package operators;
import java.util.Scanner;
public class opera15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int signal = scan.nextInt();
		int mask = scan.nextInt();
		int value = signal^mask;
		System.out.println(value);
	}

}
