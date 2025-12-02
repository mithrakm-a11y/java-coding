import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int[] freq = new int[256];   
        int max = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            freq[c]++;

            if (freq[c] > max)
                max = freq[c];
        }

        if (max == 1)
            System.out.println(0);
        else
            System.out.println(max);
    }
}
