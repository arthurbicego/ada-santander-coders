package a;

import java.util.ArrayList;
import java.util.List;

public class Array {
    public static void main(String[] args) {
        String[] list = new String[1];
        list[0] = "position 1";

        String[] list2 = new String[2];
        list2[0] = list[0];
        list2[1] = "position 2";

        List<String> list3 = new ArrayList();
    }
}
