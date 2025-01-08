package a;

import java.util.List;

public class Operators {
    public static void main(String[] args) {
        // Logical Operators
        // And: &&
        // Or: ||
        // Not: !

        Integer i = 10;

        System.out.println(i.equals(2) || i.equals(26) || i.equals(28));
        // Negating the expression requires changing the operator.
        System.out.println(!i.equals(2) && !i.equals(26) && !i.equals(28));
        System.out.println(i >= 1 && i <= 4);
        System.out.println(List.of(2,26,28).contains(i));
    }
}
