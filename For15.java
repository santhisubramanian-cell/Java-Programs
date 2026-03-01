package forloop;
import java.util.Scanner;
public class For15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		double distancecharge =0;
		int timecharge = 0;
		double totaldistance=0;
		double totalrevenue=0;
		int ridenumber = 0;
		for(int i=1;i<=n;i++) {
			double distance = scan.nextDouble();
			scan.nextLine();
			String day = scan.nextLine();
			
			ridenumber++;
			Double basefare = 3.00;
			distancecharge = distance*1.00;
			
			if(day.equals("Morning")) {
				timecharge = 0;
			}
			else if(day.equals("Afternoon")) {
				timecharge = 0;
			}
			else if(day.equals("Evening")) {
				timecharge = 3;
			}
			else if(day.equals("Night")) {
				timecharge = 5;
			}
			
			double totalfare = basefare+distancecharge+timecharge;
			totaldistance += distance;
			totalrevenue += totalfare;
			System.out.println("Ride:"+ridenumber);
			System.out.println("Distance:"+distance);
			System.out.println("Time:"+day);
			System.out.println("Base fare:"+basefare);
			System.out.println("Distance charge:"+distancecharge);
			System.out.println("Time surcharge:"+timecharge);
			System.out.println("total fare:"+totalfare);
			
		}
		double avg = totalrevenue/n;
		System.out.println("total ride:"+n);
		System.out.println("Total distance:"+totaldistance);
		System.out.println("total revenue:"+totalrevenue);
		System.out.println("Avg fare:"+avg);

	}

}
