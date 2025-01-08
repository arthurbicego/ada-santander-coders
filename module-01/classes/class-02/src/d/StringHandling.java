package d;

import java.util.Scanner;

public class StringHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type the name: ");
        String nome = scanner.nextLine();

        String firstUpperCase = nome.substring(0, 1).toUpperCase();
//        Character firstUpperCase = nome.toUpperCase().charAt(0);
        String nameWithoutFirst = nome.substring(1).toLowerCase();
        String nameHandled = firstUpperCase + nameWithoutFirst;
        System.out.println(nameHandled);

        System.out.println(nome.isEmpty());
        System.out.println(nome.isBlank());


    }
}
