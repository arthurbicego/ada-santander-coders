package d;

import java.util.Scanner;

public class StringHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type the name: ");
        String nome = scanner.nextLine();

        // Every String is immutable - wherever change you do in String you are creating another String.
        nome = nome.toUpperCase();

        String firstUpperCase = nome.substring(0, 1).toUpperCase();
        // If you want to get only 1 character:
        // Character firstUpperCase = nome.toUpperCase().charAt(0);

        String nameWithoutFirst = nome.substring(1).toLowerCase();
        String nameHandled = firstUpperCase + nameWithoutFirst;
        System.out.println(nameHandled);

        //it does not counter spaces
        System.out.println(nome.isEmpty());

        //it counters spaces
        System.out.println(nome.isBlank());


    }
}
