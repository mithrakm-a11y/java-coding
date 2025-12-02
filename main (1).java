import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();

        if (s1.length() != s2.length()) {
            System.out.println("no");
            return;
        }

        int diffCount = 0;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                diffCount++;
                if (diffCount > 1) {
                    System.out.println("no");
                    return;
                }
            }
        }

        if (diffCount == 1) {
            System.out.println("yes");
         }else {
            System.out.println("no");
        }
    }
}
