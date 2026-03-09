package two_d_array;

public class array16 {

	public static void main(String[] args) {
		String name = "Hello";
		int n = name.length();
		String str = "";
		
		for(int i=n-1;i>=0;i--) {
			str=str+name.charAt(i);
		}
		System.out.println(str);
	}

	
}
