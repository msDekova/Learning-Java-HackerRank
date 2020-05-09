import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        System.out.println(maxSum(arr));

        scanner.close();
    }

    public static int maxSum(int[][] a) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int currSum = returnSum(a, i, j);

                if (currSum > max) {
                    max = currSum;
                }
            }
        }

        return max;
    }

    private static int returnSum(int a[][], int i, int j) {
        return (a[i][j] + a[i][j + 1] + a[i][j + 2]                   // 1 1 1
                + a[i + 1][j + 1]                                     //   1
                + a[i + 2][j] + a[i + 2][j + 1] + a[i + 2][j + 2]);   // 1 1 1
    }
}
