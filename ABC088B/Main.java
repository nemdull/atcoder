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

        int[] Even = new int[N / 2];
        int[] Odd  = new int[(N + 1) / 2];

        // 0始まりに合わせて、末尾から走査。元の「iが偶数→Even / 奇数→Odd」の1始まり判定は (i+1)%2 で再現
        for (int i = N - 1; i >= 0; i--) {
            if ((i + 1) % 2 == 0) {
                Even[i / 2] = A_sorted[i];
            } else {
                Odd[i / 2] = A_sorted[i];
            }
        }

        int EvenSum = 0;
        int OddSum = 0;
        for (int i = 0; i < Even.length; i++) {
            EvenSum += Even[i];
        }
        for (int i = 0; i < Odd.length; i++) {
            OddSum += Odd[i];
        }
        if (EvenSum > OddSum) {
            System.out.println(EvenSum - OddSum);
        } else {
            System.out.println(OddSum - EvenSum);
        }
    }
}
