import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int count = 0;

        int currSum;
        for (int i = 0; i < n; i++) {
            currSum = 0;
            for (int j = i; j < n; j++) {
                currSum += arr[j];
                if (currSum < 0) {
                    count++;
                }
            }
        }

        scanner.close();

        System.out.println(count);
    }
}
