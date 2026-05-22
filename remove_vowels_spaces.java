import java.util.Scanner;
public class remove_vowels_spaces{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        String res = "";

        for(int i=1;i<s.length();i++){
            char c = s.charAt(i);
            if(c!= ' ' && c!= 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u' ){
                res+=c;
            }
        }
        System.out.print(res);
    }
}