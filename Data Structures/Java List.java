import java.util.LinkedList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfElements = scanner.nextInt();
        LinkedList<Integer> list = new LinkedList<>();
        for(int i=0;i<numOfElements;i++){
            list.add(scanner.nextInt());
        }
        int numOfQueries = scanner.nextInt();

        while(numOfQueries-->0){
            String query = scanner.next();
            int position=scanner.nextInt();

            switch (query){
                case ("Insert"):{
                    int element = scanner.nextInt();
                    list.add(position,element);
                    break;
                }
                case ("Delete"):{
                    list.remove(position);
                }
            }
        }
        scanner.close();

        for(int a:list){
            System.out.print(a+" ");
        }
    }
}
