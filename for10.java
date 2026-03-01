package forloop;
import java.util.Scanner;
public class for10 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int price=0;
		int discount=0;
		for(int i=1;i<=n;i++) {
			String seattype=sc.next();
			String customer=sc.next();
			
			if(seattype.equals("regular")) {
				price=12;
			}
			else if(seattype.equals("premium")) {
				price=18;
			}
			else if(seattype.equals("recliner")) {
				price=25;
			}
			
			if(customer.equals("adult")) {
				discount=0;
			}
			else if(customer.equals("child")) {
				discount=30;
			}
			else if(customer.equals("senior")){
				discount=25;
			}
			double ticket=price*(1-discount/100.0);
			
			System.out.println("ticket"+ i+":"+seattype+" - "+customer);
			System.out.println("base price: "+"$"+price);
			System.out.println("discount: "+discount+"%");
			System.out.println("final price: "+ticket);
			
		}
		System.out.println("total ticket: "+n);
		System.out.println("original price: ");
		System.out.println("total discount: ");
		System.out.println("final total: ");
		System.out.println("group dicount: ");
	}
}
