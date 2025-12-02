import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if ("aeiouAEIOU".indexOf(c) == -1) {
                sb.append(c);
            }
        }

        if (sb.length() == 0) {
            System.out.println("-1");
            return;
        }

        System.out.println(sb.reverse().toString());
    }
}
