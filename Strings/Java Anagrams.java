import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        char[] lettersA=new char[26];
        char[] lettersB=new char[26];

        if(a.length()!=b.length()) return false;

        a = a.toUpperCase();
        b = b.toUpperCase();
        for(int i=0;i<a.length();i++){
            lettersA[a.charAt(i)-'A']++;
            lettersB[b.charAt(i)-'A']++;
        }

        for(int i=0;i<26;i++){
            if(lettersA[i]!=lettersB[i]) return false;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}