package functions;
import java.util.Scanner;
public class fn1 {
	public static int bonus(int salary) {
		double bonus;
		
		if(salary>= 50000) {
			bonus = (10.0/100)*salary;
		}
		else {
			bonus = (5.0/100)*salary;
		}
		return (int) bonus;
		
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int salary = scan.nextInt();
		
		int res = bonus(salary);
		
		System.out.println("bonus:"+res);

	}

}
