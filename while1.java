package whiledowhile;
import java.util.Scanner;
public class while1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String password = scan.nextLine();
		
		int maxattempts =3;
		int attempt =0;
		
		while(attempt<maxattempts) {
			System.out.println("Enter the Password");
			String userinput = scan.nextLine();
			
			if(userinput.equals("correctPassword")) {
				System.out.println("Access granted");
			}
			else {
				attempt++;
				if(attempt<maxattempts) {
					System.out.println("Incorrect! Attempts remaining:"+(maxattempts-attempt));
				}
				else {
					System.out.println("Account Locked");
				}
			}
			
			
		}
		
		
		

	}

}
