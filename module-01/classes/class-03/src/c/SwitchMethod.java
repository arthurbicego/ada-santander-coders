package c;

import java.util.Scanner;

public class SwitchMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type your age category: ");
        String ageCategory = scanner.nextLine();

        switch (ageCategory){
            case "child":
                System.out.println("You are a child.");
                break;

            case "teenager":
                System.out.println("You are a teenager.");
                break;

            case "adult":
                System.out.println("You are an adult.");
                break;

            case "elderly":
                System.out.println("You are an elderly.");
                break;

            default:
                System.out.println("Error. Category not found!");
        }
    }
}
