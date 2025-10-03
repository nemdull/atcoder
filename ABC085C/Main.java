package ABC085C;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int y = scanner.nextInt();

        int[] result = {-1, -1, -1};

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n - i; j++) {
                int k = n - i - j;
                if (10000 * i + 5000 * j + 1000 * k == y) {
                    result[0] = i;
                    result[1] = j;
                    result[2] = k;
                }
            }
        }
        System.out.println(result[0] + " " + result[1] + " "+ result[2]);
        scanner.close();
    }
}
