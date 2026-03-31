import java.util.*;
public class iterationinhashing {
    public static void main(String args[]){
        HashMap<String, Integer> map = new HashMap<>();
        map.put("India", 120);
        map.put("US", 30);
        map.put("China", 150);
        System.out.println(map);
        map.put("China", 180);
        // int arr[] = {12,15,18};
        // for(int i=0;i<3;i++){
        //     System.out.print(arr[i]+" ");
        // }
        // System.out.println();
        // for(int val : arr){
        //     System.out.print(val+" ");
        // }
        // System.out.println();
        // for(Map.Entry<String, Integer> e : map.entrySet()){
        //     System.out.println(e.getKey());
        //     System.out.println(e.getValue());
        // }
        // Set<String> keys = map.keySet();
        // for(String key : keys){
            // System.out.println(keys+ " " + map.get(key));
        // }
        map.remove("China");
        System.out.println(map);

    }
    
}
