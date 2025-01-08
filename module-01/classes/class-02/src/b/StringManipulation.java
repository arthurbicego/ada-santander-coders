package b;

import java.util.Scanner;

public class StringManipulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type your email: ");
        String email = scanner.nextLine();

        // .trim: remove spaces from beginning and end
        System.out.println(email.trim());

        // .toLowerCase
        System.out.println(email.toLowerCase());

        // .toUperCase
        System.out.println(email.toUpperCase());
    }
}
