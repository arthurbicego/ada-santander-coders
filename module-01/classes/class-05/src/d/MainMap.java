package d;

import java.util.HashMap;
import java.util.Map;

public class MainMap {
    public static void main(String[] args) {
        Map<String, Object> object = new HashMap<>();

        object.put("name", "Arthur");
        object.put("age", 27);

//        Map<String, Object> object = Map.of("name", "Arthur", "age", 27);

        System.out.println(object.get("name"));
        System.out.println(object.get("age"));
    }
}
