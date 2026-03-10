package string;
import java.util.Scanner;
public class Str2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		for(int i=1;i<=n;i++) {
			String p = scan.nextLine();
			
			boolean hasUpper=false,hasLower=false,hasDigit=false,hasSpecial=false;
			
			for(char c : p.toCharArray()) {
				if(Character.isUpperCase(c)){
					hasUpper=true;
				}
				else if(Character.isLowerCase(c)) {
					hasLower=true;
				}
				else if(Character.isDigit(c)) {
					hasDigit=true;
				}
				else {
					hasSpecial=true;
				}
			    
			}
			if(p.length()<8) {
				System.out.println(i+ "."+ p +"-Weak(Length<8)" );
			}
			else if(!hasDigit) {
				System.out.println(i+"."+p+"- Weak(Missing digit)");
			}
			else if(!hasUpper || !hasLower || !hasSpecial) {
				System.out.println(i+"."+p+"-Weak");
			}
			else {
				System.out.println(i+"."+p+"-Strong");
			}
		
			
			
		}
		
		
		
		
		

	}

}
