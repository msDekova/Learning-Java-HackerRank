import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int left=0;
        int right=A.length()-1;

        while(right>0 && left<right){
            if(A.charAt(left)!=A.charAt(right)){
                System.out.println("No");
                return;
            }
            left++;
            right--;
        }
        System.out.println("Yes");
    }
}



