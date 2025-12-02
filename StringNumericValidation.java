import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        boolean isNumeric = true;

        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) {
                isNumeric = false;
                break;
            }
        }

        System.out.println(isNumeric ? "yes" : "no");
    }
}
