import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long N = sc.nextLong();
        long sum = 0;

        while (N > 0) {
            long digit = N % 10;
            sum += digit * digit;   
            N /= 10;
        }

        System.out.println(sum);
    }
}
