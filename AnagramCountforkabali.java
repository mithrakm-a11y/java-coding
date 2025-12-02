import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        String target = "kabali";
        int[] targetFreq = getFreq(target);
        int count = 0;
        
        for (int i = 0; i < N; i++) {
            String s = sc.next();
            if (s.length() != target.length()) continue;
            
            int[] currFreq = getFreq(s);

            if (isSame(targetFreq, currFreq)) {   
                count++;
            }
        }
        
        System.out.println(count);
    }
    
    public static int[] getFreq(String s) {
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        return freq;
    }

    public static boolean isSame(int[] a, int[] b) {
        for (int i = 0; i < 26; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }
}
