package b;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArraysMethods {
    public static void main(String[] args) {
        List<String> productsList = new ArrayList<>();
        productsList.add("Pencil");
        productsList.add("Scissor");
        productsList.add("Pen");
        productsList.add("Eraser");

//        for (String item : productsList){
//            System.out.println(item);
//        }

        for (int i = 0; i < productsList.size(); i++) {
            System.out.println(( i + 1 ) + ". " + productsList.get(i));
        }

        Object[] listPrimitive = productsList.toArray();

        productsList.remove(productsList.get(1));
        productsList.set(0, "Red Pencil");

//        Sort the list in order
        productsList.sort((firstValue, secondValue) -> firstValue.compareTo(secondValue));
        System.out.println(productsList);

//        Inverse order
        productsList.sort((firstValue, secondValue) -> secondValue.compareTo(firstValue));


        Collections.reverse(productsList);
        System.out.println(productsList);
    }
}
