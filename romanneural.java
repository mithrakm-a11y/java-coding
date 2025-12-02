import java.util.Scanner;

public class romanneural {

    static int getValue(char c) {
        if (c == 'I') return 1;
        if (c == 'V') return 5;
        if (c == 'X') return 10;
        if (c == 'L') return 50;
        if (c == 'C') return 100;
        return -1;  
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next().trim();
        
        int n = s.length();
        int total = 0;
        boolean valid = true;

        for (int i = 0; i < n; i++) {

            int a = getValue(s.charAt(i));
            if (a == -1) {   
                valid = false;
                break;
            }

            if (i + 1 < n) {
                int b = getValue(s.charAt(i + 1));

                
                String pair = "" + s.charAt(i) + s.charAt(i + 1);

                if (a < b) {
                    if (pair.equals("IV") || pair.equals("IX") ||
                        pair.equals("XL") || pair.equals("XC")) {

                        total += b - a;
                        i++; 
                        continue;
                    } else {
                        valid = false;
                        break;
                    }
                }
            }

            total += a;
        }

        if (valid)
            System.out.println(total);
        else
            System.out.println("-1");
    }
}
