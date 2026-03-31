import java.util.*;
public class hashing {
    public static void main(String args[]){
        HashMap<String, Integer> map = new HashMap<>();
        map.put("India", 120);
        map.put("US", 30);
        map.put("China", 150);
        System.out.println(map);
        map.put("China", 180);
        System.out.println(map);
        //search
        if(map.containsKey("China")){
            System.out.println("Key is present in the map");

        }
        else{
            System.out.println("Key is not present in the map");
        }
        System.out.println(map.get("China"));//key exists
        System.out.println(map.get("Indonesia"));// key doesnt exists;
    }
    
}
