import java.util.*;


public class set {
    public static void main(String[] args) {

        Set<Integer> t = new HashSet<Integer>();
        t.add(5);
        t.add(7);
        t.add(5);
        t.add(9);

        System.out.println(t);

        // check if a value exists in set, quick
        boolean x = t.contains(5);
        System.out.println(x);


        t.remove(9);
        t.remove(5);

        t.clear();


        int size = t.size();


        // slow
        ArrayList<Integer> m = new ArrayList<Integer>();
        m.add(1);
        m.add(10);

        m.get(0);  // 1
        m.set(1,5);  // [1, 5]

        m.size();

        m.add(11);
        m.add(12);
        m.subList(1, 2);  // [5, 11]




    }
}
