package e;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapCollection {
    public static void main(String[] args) {

        Map<String, Object> objectMap = new HashMap<>();
        userInput(objectMap);
        printMap(objectMap);

    }

    public static void printMap(Map<String, Object> objectMap) {
        String list = "\n";
        for (Map.Entry entry : objectMap.entrySet()) {
            list += entry.getKey() + " - " + entry.getValue() + "\n";
        }

        System.out.println(objectMap.entrySet());
        System.out.println(list);
    }

    public static void userInput(Map<String, Object> objectMap) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Enter your age: ");
        Integer age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter your gender: ");
        String gender = scanner.nextLine();
        objectMap.put("name", name);
        objectMap.put("age", age);
        objectMap.put("gender", gender);
    }
}
