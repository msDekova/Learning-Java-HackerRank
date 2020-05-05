import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.

        ArrayList<String> tokens = new ArrayList<String>();

        Scanner tokenize = new Scanner(s); //Scanner reads the String s
        tokenize.useDelimiter("[ !,?._'@]+");
        while (tokenize.hasNext()){
            tokens.add(tokenize.next());
        }

        System.out.println(tokens.size());
        for(String str : tokens){
            System.out.println(str);
        }

        scan.close();
    }
}

