package functions;
import java.util.Scanner;
public class fn10 {
	public static void armstrong(int n) {
		int original = n;
        int temp = n;
        int count = 0;
        int sum = 0;
        while (temp != 0) {
            count++;
            temp /= 10;
        }

        temp = n;
		
		while (temp != 0) {
            int num = temp % 10;
            int res = 1;

            for (int i = 1; i <= count; i++) {
                res *= num;
            }

            sum += res;
            temp /= 10;
        }

		if(original == sum) {
			System.out.println("Armstrong");
		}
		else {
			System.out.println("Not Armstrong");
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		armstrong(n);

	}

}
