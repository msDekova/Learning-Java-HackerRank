// You are given n pairs of strings. Two pairs (a,b) and (c,d) are identical if a=c and b=d. That also implies (a,b)
// is not same as (b,a).After taking each pair as input, you need to print number of unique pairs you currently have.

import javafx.util.Pair;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfEntries = scanner.nextInt();
        HashSet<Pair<String, String>> pairs = new HashSet<>();
        LinkedList<Integer> ans = new LinkedList<>();
        while(numOfEntries-->0){
            pairs.add(new Pair<String, String>(scanner.next(),scanner.next()));
            ans.add(pairs.size());
        }

        for(int a:ans){
            System.out.println(a);
        }

        scanner.close();
    }
}
