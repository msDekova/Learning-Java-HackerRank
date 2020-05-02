// We use the integers a, b, and n to create the following series:
//
//You are given  queries in the form of , , and . For each query, print the series corresponding to the given a, b,
// and n values as a single line of  space-separated integers.

import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int ans=a;
            for(int j=0;j<n;j++){
                ans+=Math.pow(2,j) * b;
                System.out.print(ans+ " ");
            }
            System.out.println();
        }

        in.close();
    }
}