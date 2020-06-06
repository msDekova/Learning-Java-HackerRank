/*
Sometimes it's better to use dynamic size arrays. Java's Arraylist can provide you this feature. Try to solve this
problem using Arraylist.
You are given n lines. In each line there are zero or more integers. You need to answer a few queries where you need to
tell the number located in y position of x line.
Take your input from System.in.
Input Format
The first line has an integer n. In each of the next n lines there will be an integer d denoting number of integers on
that line and then there will be d space-separated integers. In the next line there will be an integer q denoting number
 of queries. Each query will consist of two integers x and y.
Constraints




Each number will fit in signed integer.
Total number of integers in  lines will not cross .
Output Format
In each line, output the number located in  position of  line. If there is no such position, just print "ERROR!"
Sample Input
5
5 41 77 74 22 44
1 12
4 37 34 36 52
0
3 20 22 33
5
1 3
3 4
3 1
4 3
5 5
Sample Output
74
52
37
ERROR!
ERROR!
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaArraylist {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        ArrayList<ArrayList<Integer>> storeArr = new ArrayList<>();
        while(n-->0){
            int d=scanner.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
            while(d-->0){
                arr.add(scanner.nextInt());
            }
            storeArr.add(arr);
        }

        int q = scanner.nextInt();
        while(q-->0){
            try{
                int line = scanner.nextInt();
                int position = scanner.nextInt();

                ArrayList<Integer> ans = storeArr.get(line-1);

                System.out.println(ans.get(position-1));
            } catch (IndexOutOfBoundsException e){
                System.out.println("ERROR!");
            }
        }

        scanner.close();
    }

}
