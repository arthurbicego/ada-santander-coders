package a;

import java.util.List;

public class FunctionalProgramming {
    public static void main(String[] args) {

        //Functional Programming Examples: Streams, Lambda...
        Integer n = 7;
        List<Integer> list = List.of(0,1,2,3,4,5,6,7,8,9,10);

        list.forEach((i)->System.out.println("7 + " + i + " = " + (7+i)));

        /*
        for(int i = 0; i <=10; i++) {
            System.out.println("7 + " + i + " = " + (7+i));
        }
         */
    }
}