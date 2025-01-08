package a;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String emailLogin = "arthurbq5@gmail.com";
        System.out.println("Type your e-mail: ");
        String email = scanner.nextLine();

        System.out.println(emailLogin.equals(email));

    }
}
