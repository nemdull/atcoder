package ABC088B;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Input
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        scanner.close();

        int[] A_sorted = A.clone();
        Arrays.sort(A_sorted);

        int[] Alice = new int[N / 2];
        int[] Bob = new int[N / 2];

        for (int i = 0; i < N; i++) {
            if (i % 2 == 0) {
                Alice[i] = A_sorted[i];
            } else {
                Bob[i] = A_sorted[i];
            }
        }

        int Alice_sum = 0;
        for (int i = 0; i < Alice.length; i++) {
            Alice_sum += Alice[i];
        }

        int Bob_sum = 0;
        for (int i = 0; i < Bob.length; i++) {
            Bob_sum += Bob[i];
        }

        System.out.println(Alice_sum - Bob_sum);
    }
}
