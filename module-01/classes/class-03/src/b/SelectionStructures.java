package b;

import java.util.Scanner;

public class SelectionStructures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        System.out.println("Type your name: ");
        String name = scanner.nextLine().toUpperCase();
         */

        /*
        if(nome.contains("A")){
            System.out.println("Your name contains A. You are at the front of the queue.");
        } else if (nome.contains("B")) {
            System.out.println("Your name contains B. You are second in line.");
        } else {
            System.out.println("You are at the end of the queue.");
        }
         */

        System.out.println("Type your age: ");
        Integer age = scanner.nextInt();

        if (age < 12) {
            System.out.println("You are a child.");
        } else if (age < 18) {
            System.out.println("You are a teenager.");
        } else if (age < 60) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are an elderly.");
        }
    }
}
