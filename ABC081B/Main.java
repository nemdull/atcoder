package ABC081B;

import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        int count = 0;
        boolean flag = true;
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        do {
            for (int i = 0; i < N; i++) {
                int r = A[i] % 2;
                if (r != 0) {
                    flag = false;
                    break;
                } else {
                    A[i] /= 2;
                }
                if (i == N - 1) {
                    count += 1;
                }
            }
        } while (flag);
        System.out.println(count);
    }
}