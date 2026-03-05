package nestedloop;
import java.util.Scanner;
public class Nested8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int students = scan.nextInt();
		int days = scan.nextInt();
		
		System.out.println("Attendance Matrix:");
		System.out.print("Student"+" ");
		for(int i=1;i<=days;i++) {
			System.out.print("Day"+i+" ");
		}
		System.out.print("Attendance");
		System.out.println();
		double percentage=0;
		int count=0;
		for(int i=1;i<=students;i++) {
			String name = scan.next();
			System.out.print(name+" ");
			int count1=0;
			for(int j=1;j<=days;j++) {
				char ch = scan.next().charAt(0);
				System.out.print(ch+" ");
				if(ch == 'P') {
					count1++;
				}
			}
			percentage = ((double)count1/days)*100.0;
			if(percentage == 100.00) {
				count++;
			}
			System.out.printf("%.2f%%",percentage);
			System.out.println();
			
		}
		System.out.println("Perfect Attendance:"+count + "students");

	}

}
