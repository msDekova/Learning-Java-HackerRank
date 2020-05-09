import java.math.BigInteger;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();

        BigInteger bi = new BigInteger(n);
        if(bi.isProbablePrime(1)){
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
    }
}
