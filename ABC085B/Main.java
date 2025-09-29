package ABC085B;

import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] d = new int[N];
        int count = 1;

        for (int i = 0; i < N; i++) {
            d[i] = sc.nextInt();
        }

        Arrays.sort(d);

        for (int i = 0; i < N - 1; i++) {
            int diff = d[i + 1] - d[i];
            if (diff > 0) {
                count += 1;
            } else if (diff == 0) {
                continue;
            } else {
                break;
            }
        }

        System.out.println(count);
    }
}