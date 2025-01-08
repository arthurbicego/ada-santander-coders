package c;

import java.util.Arrays;
import java.util.Scanner;

public class StringValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type your email: ");
        String email = scanner.nextLine();

        // .contains: checks if a string contains another string.
        System.out.println("Contains @: " + email.contains("@"));
        System.out.println("Contains .: " + email.contains("."));

        //.length returns the number of characters
        System.out.println("Email size: " + email.length());
        System.out.println("Minimum size: " + (email.length() >= 5));

        // .indexOf returns the position of a character in a String.
        System.out.println("Validate characters before @:" + (email.indexOf("@") > 0));

        // .substring returns a piece of the String (1 - puts only the initial position until the end of the String; 2 - defines the initial and final position of the String).
        String emailAfterAtSign = email.substring(email.indexOf("@"));

        System.out.println("Validate characters between @ e .:" + (emailAfterAtSign.indexOf(".") > 1));

        System.out.println("Validate characters after .:" + (emailAfterAtSign.length() > emailAfterAtSign.indexOf(".") + 1));

        // .split splits the string into an array by the number of times according to the declared criteria
        System.out.println("Split array: " + Arrays.toString(email.split("@")));
        System.out.println("Validate just one @: " + (email.split("@").length == 2));

    }
}
