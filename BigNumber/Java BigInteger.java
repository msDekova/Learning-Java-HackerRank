import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scanner = new Scanner(System.in);

        String num1 = scanner.nextLine();
        String num2 = scanner.nextLine();

        BigInteger a = new BigInteger(num1);
        BigInteger b = new BigInteger(num2);

        System.out.println(a.add(b));
        System.out.println(a.multiply(b));


        scanner.close();
    }
}