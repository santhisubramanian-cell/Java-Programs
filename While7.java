package whiledowhile;
import java.util.Scanner;
public class While7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int choice;
		double num1,num2,result;
		do {
			System.out.println("Calculator menu:");
			System.out.println("1.Add");
			System.out.println("2.Subtract");
			System.out.println("3.Multiply");
			System.out.println("4.Divide");
			System.out.println("5.Exit");
			System.out.println("Choice:");
			choice=scan.nextInt();
			
			if(choice>=1 && choice<=4) {
				System.out.println("Enter two numbers:");
				num1 = scan.nextDouble();
				num2=scan.nextDouble();
				switch(choice) {
				case 1:
					result = num1+num2;
					System.out.print("result"+result);
					break;
				case 2:
					result = num1-num2;
					System.out.print("result"+result);
					break;
				case 3:
					result = num1*num2;
					System.out.print("result"+result);
					break;
				case 4:
					if(num2!=0) {
					result = num1/num2;
					System.out.print("result"+result);
					}
					else {
						System.out.print("Not divided");
					}
					break;
				}
			}
			else if(choice==5) {
				System.out.print("Good bye!");
			}
			else {
				System.out.print("Ivalid");
			}
			
		}
		while(choice!=5);

	}

}
