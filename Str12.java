package string;
import java.util.*;
import java.util.*;

public class Str12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());

        System.out.println("Parsed Fields:");

        for (int k = 1; k <= t; k++) {
            String line = sc.nextLine();

            List<String> fields = new ArrayList<>();
            String field = "";
            boolean inQuotes = false;

            for (char c : line.toCharArray()) {

                if (c == '"') {
                    inQuotes = !inQuotes; 
                    field += c;
                } 
                else if (c == ',' && !inQuotes) {
                    fields.add(field.trim());
                    field = "";
                } 
                else {
                    field += c;
                }
            }

            fields.add(field.trim());

            System.out.println(k + ". " + fields);
        }

        sc.close();
    }
}