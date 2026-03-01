package forloop;
import java.util.Scanner;
public class for11 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int num=0;
		int cap=0;
		int count=0;
		double sum=0.0;
		for(int i=1;i<=n;i++) {
			String vehicle=sc.next();
			double hours=sc.nextDouble();
			
			if(vehicle.equals("car")) {
				num=3;
				cap=30;
			}
			else if(vehicle.equals("motorcycle")) {
				num=2;
				cap=20;
			}
			else if(vehicle.equals("truck")) {
				num=5;
				cap=60;
			}
			else if(vehicle.equals("bus")) {
				num=7;
				cap=100;
			}
			double fee=hours*num;
			sum+=fee;
			if(hours>8){
				count++;
			}
			System.out.println("vehicle"+ i+":"+vehicle);
			System.out.println("hours parked: "+hours);
			System.out.println("hourly rate: "+num);
			System.out.println("parking fee: "+fee);
			System.out.println("cap applied: ");	
		}
		double fine=sum/n;
		System.out.println("total vehicle: "+n);
		System.out.println("total revenue: "+sum);
		System.out.println("average fee: "+fine);
		System.out.println("peak hour vehicle: "+count);
	}
}
