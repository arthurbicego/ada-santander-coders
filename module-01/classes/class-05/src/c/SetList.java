package c;

import java.util.HashSet;
import java.util.Set;

public class SetList {
    public static void main(String[] args) {
        Set<String> list = new HashSet<>();
        list.add("Name 1");
        list.add("Name 2");
        list.add("Name 3");
        list.add("Name 4");

        list.remove("Name 3");

        for (String item : list) {
            System.out.println(item);
        }

    }
}
