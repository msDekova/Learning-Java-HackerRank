import java.util.Scanner;

public class JavaStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String input = scanner.nextLine();
            while (input.length() != (input = input.replaceAll("\\(\\)|\\[\\]|\\{\\}", "")).length()) ;
            if (input.isEmpty()) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }

        scanner.close();
    }
}
