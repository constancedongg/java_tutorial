import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;
import java.util.TreeMap;
import java.util.LinkedHashMap;

public class maps {
    public static void main(String[] args) {

        // hash map does not keep the order of input
        // very fast
        Map m  = new HashMap();
        m.put("tim", 5);
        m.put("joe", "good");
        m.put(11, "girl");

        System.out.println(m);
        System.out.println(m.get("tim"));
        System.out.println(m.get(11));


        // Treemap keeps the sorted order
        // But the keys type have to be the same
        Map map = new TreeMap();
        map.put("tim", 3);
        map.put("alice", 23);
        map.put("bob", 100);
        System.out.println(map);




        // LinkedHashMap keeps the order we add in
        Map lm = new LinkedHashMap();
        lm.put("apple", 5);
        lm.put("strawberry", 10);
        lm.put("cherry", 8);




        // hashmap operators
        lm.containsValue(8);
        lm.containsKey("apple");

        lm.values();

        lm.keySet();


        lm.get(5); // get null because no key equals 5


        // remove a key
        lm.remove("apple");

        lm.isEmpty();



    }
}
