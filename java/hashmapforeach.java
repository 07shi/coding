import java.util.*;
public class hashmapforeach {

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Shivam", 90);
        map.put("Rahul", 85);
        map.put("Aman", 88);

        for(String key : map.keySet()) {
            System.out.println(key);
        }
    }
}

