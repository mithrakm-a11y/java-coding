import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        StringBuilder sb = new StringBuilder();
        boolean spaceFound = false;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == ' ') {
                if (!spaceFound) {   
                    sb.append(c);
                    spaceFound = true;
                }
            } else {
                sb.append(c);
                spaceFound = false;  
                
            }
        }

        if (sb.length() > 0 && sb.charAt(0) == ' ')
            sb.deleteCharAt(0);

        if (sb.length() > 0 && sb.charAt(sb.length() - 1) == ' ')
            sb.deleteCharAt(sb.length() - 1);

        System.out.println(sb.toString());
    }
}
