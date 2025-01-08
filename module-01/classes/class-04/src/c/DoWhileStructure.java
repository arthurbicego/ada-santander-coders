package c;

import java.util.Scanner;

public class DoWhileStructure {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean keep = true;

        do {
            System.out.println("1. Register Product.");
            System.out.println("2. List Product.");
            System.out.println("3. Delete Product.");
            System.out.println("0. Exit Menu.");
            Integer choice = scanner.nextInt();
            switch (choice) {
                case 1 -> System.out.println("Register Product.");
                case 2 -> System.out.println("List Product.");
                case 3 -> System.out.println("Delete Product.");
                case 0 -> {
                    System.out.println("Exit Menu.");
                    keep = false;
                }
            }
        } while (keep);

    }
}
