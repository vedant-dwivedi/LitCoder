package Module4.Lab1;

import java.util.Scanner;

public class Array_Manipulation {
    public static int mixTheArray(int n, int[][] queries) {
        int[] array = new int[n];

        for (int[] query : queries) {
            int start = query[0];
            int end = query[1];
            int value = query[2];
            array[start - 1] += value;
            if (end < n) {
                array[end] -= value;
            }
        }

        int max_value = array[0];
        int current_value = array[0];

        for (int i = 1; i < n; i++) {
            current_value += array[i];
            max_value = Math.max(max_value, current_value);
        }

        return max_value;
    }
    // ..........

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int q = scanner.nextInt();

        int[][] queries = new int[q][3];
        for (int i = 0; i < q; i++) {
            for (int j = 0; j < 3; j++) {
                queries[i][j] = scanner.nextInt();
            }
        }

        int result = mixTheArray(n, queries);
        System.out.println(result);
    }
}