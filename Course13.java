package ifelse;
import java.util.Scanner;
public class Course13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String studentstatus = scan.nextLine();
        int credithours = scan.nextInt();
        scan.nextLine();  
        String programtype = scan.nextLine();
        String residency = scan.nextLine();
		
		int basetuition = 0;
		double residencymul =0;
		int programfee=0;
		int activityfee =0;
		
		if(programtype.equals("Undergraduate")) {
			basetuition=350;
		}
		else if(programtype.equals("Graduate")) {
			basetuition=550;
		}
		else if(programtype.equals("Professional")) {
			basetuition=800;
		}
		
		if(residency.equals("In-State")) {
			residencymul=1.0;
		}
		else if(residency.equals("Out-of-State")) {
			residencymul=2.5;
		}
		else if(residency.equals("International")) {
			residencymul=3.0;
		}

		if(studentstatus.equals("Full-Time")) {
			if(programtype.equals("Undergraduate")) {
				programfee=500;
			}
			else if(programtype.equals("Graduate")) {
				programfee=750;
			}
			else if(programtype.equals("Professional")) {
				programfee=1200;
			}
		}
		
		else if(studentstatus.equals("Part-Time")) {
			if(programtype.equals("Undergraduate")) {
				programfee=300;
			}
			else if(programtype.equals("Graduate")) {
				programfee=750;
			}
			else if(programtype.equals("Professional")) {
				programfee=900;
			}
		}
		if(studentstatus.equals("Continuing-Education")) {
			if(programtype.equals("Undergraduate")) {
				programfee=150;
			}
			else if(programtype.equals("Graduate")) {
				programfee=150;
			}
			else if(programtype.equals("Professional")) {
				programfee=150;
			}
		}
		
		if(studentstatus.equals("Full-Time")) {
			activityfee=200;
		}
		else if(studentstatus.equals("Part-Time")) {
			activityfee=100;
		}
		else if(studentstatus.equals("Continuing-Education")) {
			activityfee=50;
		}
		
		double tuitioncost = credithours*basetuition*residencymul;
		double totalfee = tuitioncost+programfee+activityfee;
		
		String category="";
		if(residency.equals("In-State")) {
			if(studentstatus.equals("Full-Time")) {
				category="Standard";
			}
			else if(studentstatus.equals("Continuing-Education")) {
				category="Reduced";
			}
			
		}
		if(residency.equals("Out-of-State")) {
			if(studentstatus.equals("Full-Time")) {
				category="Premium";
			}
			else if(studentstatus.equals("Continuing-Education")) {
				category="Premium";
			}
			else if(studentstatus.equals("Part-Time")) {
				category="Premium";
			}
			
		}
		if(residency.equals("International")) {
			if(studentstatus.equals("Full-Time")) {
				category="Premium";
			}
			else if(studentstatus.equals("Continuing-Education")) {
				category="Premium";
			}
			else if(studentstatus.equals("Part-Time")) {
				category="Premium";
			}
			
		}
		System.out.println("Student status: "+studentstatus);
		System.out.println("Credit hours: "+credithours);
		System.out.println("Program type: "+programtype);
		System.out.println("Residency: "+residency);
		System.out.println("Base tuition: "+basetuition);
		System.out.println("Residency: "+residencymul);
		System.out.println("Program fee: "+programfee);
		System.out.println("student activity: "+activityfee);
		System.out.println("Total registration: "+totalfee);
		System.out.println("Fee category: "+category);
		
		
		
		
		
		
		
		
		
		
	}

}
