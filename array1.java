package two_d_array;
import java.util.Scanner;
public class array1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int student = scan.nextInt();
		int subject = scan.nextInt();
		
		int[][] a = new int[student][subject];
		
		for(int i=0;i<student;i++) {
			for(int j=0;j<subject;j++) {
				a[i][j]=scan.nextInt();
			}
		}
		System.out.println("Student Averages:");
		for(int i=0;i<student;i++) {
			int sum1=0;
			for(int j=0;j<subject;j++) {
				sum1+=a[i][j];
			}
			double avg = (double)sum1/(double)student;
			System.out.printf("Student %d:%.2f\n",(i+1),avg);
		}
		System.out.println();
		System.out.println("subjects averages:");
		for(int j=0;j<subject;j++) {
			int sum2=0;
			for(int i=0;i<student;i++) {
				sum2+=a[i][j];
			}
			double avg =(double)sum2/(double)subject;
			System.out.printf("Subjects %d:%.2f\n",(j+1),avg);
		}
		
	}

}
