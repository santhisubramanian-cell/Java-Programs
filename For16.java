package forloop;
import java.util.Scanner;
public class For16 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.nextLine();
		
		int score =0;
		String result ="";
		int passcount=0;
		int failcount=0;
		double total=0;
		int highestscore =0;
		for(int i=1;i<=n;i++) {
			String name = scan.nextLine();
			int cans = scan.nextInt();
			int wans = scan.nextInt();
			int unattempt = scan.nextInt();
			
			score = (cans*4)-(wans*3)+(unattempt*0);
			
			if(score>=32) {
				result = "Pass";
				passcount++;
			}
			else {
				result = "Fail";
				failcount++;
			}
			highestscore = Math.max(score, unattempt);
			total+=score;
			System.out.println("Student:"+name);
			System.out.println("correct:"+cans);
			System.out.println("Wrong:"+wans);
			System.out.println("Unattempt:"+unattempt);
			System.out.println("score:"+score);
			System.out.println("Result:"+result);
			
		}
		double avg = total/n;
		System.out.println("total Student:"+n);
		System.out.println("pass count:"+passcount);
		System.out.println("fail count:"+failcount);
		System.out.println("class avg:"+avg);
		System.out.println("Highest score:"+highestscore);
		

	}

}
