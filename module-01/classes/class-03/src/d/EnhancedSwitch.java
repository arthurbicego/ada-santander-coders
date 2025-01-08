package d;

import java.util.Scanner;

public class EnhancedSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type your age category: ");
        String ageCategory = scanner.nextLine();

        switch (ageCategory) {
            case "child","teenager" -> {
                System.out.println("You are a child anyway.");
                System.out.println("Young!");
            }

//            case "teenager" -> System.out.println("You are a teenager");

            case "adult" -> System.out.println("You are an adult.");

            case "elderly" -> System.out.println("You are an elderly.");

            default -> System.out.println("Error. Category not found!");
        }
    }
}
