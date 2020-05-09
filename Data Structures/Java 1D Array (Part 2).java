import java.util.*;

public class Solution {


    public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.
        if (game == null || game[0] != 0) {
            return false;
        }
        return recursivelyCanWin(leap, game, 0);
    }

    private static boolean recursivelyCanWin(int leap, int[] game, int position) {
        if (position < 0 || game[position] != 0) {
            return false;
        }
        if (position == game.length - 1 || position + leap > game.length - 1) {
            return true;
        }

        game[position] = 1;

        return recursivelyCanWin(leap, game, position - 1) ||
                recursivelyCanWin(leap, game, position + 1) ||
                recursivelyCanWin(leap, game, position + leap);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println((canWin(leap, game)) ? "YES" : "NO");
        }
        scan.close();
    }
}