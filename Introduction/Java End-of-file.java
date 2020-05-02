// The challenge here is to read  lines of input until you reach EOF, then number and print all  lines of content.
//Hint: Java's Scanner.hasNext() method is helpful for this problem.
//Input Format
//Read some unknown  lines of input from stdin(System.in) until you reach EOF; each line of input contains a non-empty
// String.
//Output Format
//For each line, print the line number, followed by a single space, and then the line content received as input.

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str;
        int count=0;
        while(scanner.hasNext()){
            str=scanner.nextLine();
            System.out.println(++count + " " + str);
        }
    }
}
