// You are given a phone book that consists of people's names and their phone number. After that you will be given
// some person's name as query. For each query, print the phone number of that person.

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfEntries = Integer.parseInt(scanner.nextLine());
        Map<String,Long> phoneBook = new HashMap<>();
        while(numOfEntries-->0){
            String name = scanner.nextLine();
            long phoneNumber = Long.parseLong(scanner.nextLine());
            phoneBook.put(name,phoneNumber);
        }

        while(scanner.hasNext()){
            String query = scanner.nextLine();
            if(phoneBook.containsKey(query)){
                System.out.println(query + "=" + phoneBook.get(query));
            } else {
                System.out.println("Not found");
            }
        }
    }
}
