package forloop;
import java.util.Scanner;
public class for2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		char grade=0;
		int passcount=0;
		int failcount=0;
		String status ="";
		int sum=0;
		int max=0;
		
		for(int i=1;i<=n;i++) {
			String name = scan.next();
			int score = scan.nextInt();
			if(score>=85 && score<=100) {
					grade='A';
				}
				else if(score>=70 && score<=84) {
					grade='B';
				}
				else if(score>=60 && score<=69) {
					grade='C';
				}
				else if(score>=50 && score<=59) {
					grade='D';
				}
				else if(score>=0 && score<=49) {
					grade='E';
				}
				if(score>max) {
					max=score;
				}
			
			if(score>=60) {
				status="Pass";
				passcount++;
			}
			else {
				status ="Fail";
				failcount++;
			}
			sum+=score;
			
			System.out.println("Student: "+name);
			System.out.println("Score: "+score);
			System.out.println("Letter grade: "+grade);
			System.out.println("Status: "+status);
	
			
	   }
		double avg = sum/n;
		System.out.println("Total student: "+n);
		System.out.println("class avg: "+avg);
		System.out.println("pass: "+passcount);
		System.out.println("fail: "+failcount);




	}

}