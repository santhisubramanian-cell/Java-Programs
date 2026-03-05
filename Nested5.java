package nestedloop;
import java.util.Scanner;
public class Nested5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int days = scan.nextInt();
		int startday = scan.nextInt();
		
		System.out.println("Calender Grid:");
		System.out.println("MON TUE WED THU FRI SAT SUN");
		int date =1;
		int totalcell = (startday-1)+days;
		
		for(int i=0;i<totalcell;i++) {
			if(i<startday-1) {
				System.out.print(" ");
			}
			else {
				System.out.print(date+" ");
				date++;
			}
			if((i+1)%7==0) {
				System.out.println();
			}
		}
	}

}
