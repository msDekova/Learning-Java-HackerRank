import java.util.Scanner;

class MyRegex{
    String pattern;
    Myregex(){
        pattern = null;
    }
    MyRegex(String pattern){
        setPattern(pattern);
    }

    public void setPattern(String p){
        this.pattern = p;
    }
    public String getPattern(){
        return this.pattern;
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input = scanner.nextLine();
        MyRegex mr = new MyRegex(input);
        if(isValidIP(mr)){
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        scanner.close();
    }

    static boolean isValidIP(MyRegex mr){
        String ip=mr.getPattern();
        String regex = ("(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])");
        return ip.matches(regex+"."+regex+"."+regex+"."+regex);
    }
}
