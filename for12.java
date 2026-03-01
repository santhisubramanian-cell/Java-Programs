package forloop;
import java.util.Scanner;
public class for12 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char n1=sc.next().charAt(0);
		char n2=sc.next().charAt(0);
		int sum=0;
		if(n1=='a'||n1=='e'||n1=='i'||n1=='o'||n1=='u'||n1=='A'||n1=='E'||n1=='I'||n1=='O'||n1=='U') {
			sum=n2+n1;
		}
		else if(n1!='a'||n1!='e'||n1!='i'||n1!='o'||n1!='u'||n1=='A'||n1=='E'||n1=='I'||n1=='O'||n1=='U') {
			sum=n2-n1;
		}
		else if(n1=='a'||n1=='e'||n1=='i'||n1=='o'||n1=='u'||n1!='A'||n1!='E'||n1!='I'||n1!='O'||n1!='U') {
			sum=n2-n1;
		}
		else {
			System.out.println("neither");
		}
		
		System.out.println(sum);
		
	}
}
