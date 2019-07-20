import java.util.HashMap;
import java.util.Map;


public class mapExample {

    public static void main(String[] args) {
        Map m = new HashMap();
        String str = "Hello, my name is wsyzxls, and i am good.";

        for (char c:str.toCharArray()){
            if (m.containsKey(c)){
                int old  = (int) m.get(c);
                m.put(c, old + 1);
            }
            else{
                m.put(c, 1);
            }

        }

        System.out.println(m);

        // only single quotation mark works here, not double quotation marks
        m.remove('a');
        System.out.println(m);
    }
}
