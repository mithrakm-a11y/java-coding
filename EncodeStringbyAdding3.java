import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toUpperCase();
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                char shifted = (char)(((c - 'A' + 3) % 26) + 'A');
                sb.append(shifted);
            } else {
                sb.append(c); 
            }
        }

        System.out.println(sb.toString());
    }
}
