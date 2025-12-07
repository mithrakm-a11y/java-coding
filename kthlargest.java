import java.util.*;

public class kthlargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] parts = sc.nextLine().trim().split("\\s+");
        int[] arr = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            arr[i] = Integer.parseInt(parts[i]);
        }

        int k = Integer.parseInt(sc.nextLine().trim());

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int num : arr) {
            pq.offer(num);
            if (pq.size() > k) {
                pq.poll();  
            }
        }

        System.out.println(pq.peek());
    }
}