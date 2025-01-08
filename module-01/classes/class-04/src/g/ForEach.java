package g;

import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        List<String> list = List.of("arthur", "pedro", "amanda");
        list.forEach(item -> {
            String firstLetter = item.substring(0, 1).toUpperCase();
            String restOfName = item.substring(1, item.length());
            String fullName = firstLetter + restOfName;
            System.out.println(fullName);
        });
    }
}
