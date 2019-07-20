import java.util.ArrayList;
import java.util.Scanner;


public class Objects {
    public static void main(String[] args) {
        // Objects are instances of a data type, e.g. array, hashmap, boolean, integer,..
        Scanner sc = new Scanner(System.in);
        sc.next();  //.next() method can be only used to scanner data type.

        // below are all objects we created
        int x = 5;
        String s = "abs";


        int l = s.length();



        diary();

        note("Good!", 3);

        System.out.println(add2(6));

        System.out.println(str2("hi"));


    }



    // define a function; void means return nothing
    public static void diary(){
        System.out.println("Today is a good day!");
    }



    // defines a function with parameter; needs to input string and integer as parameter
    public static void note(String str, int x){
        for (int i = 0; i < x; i++) {
            System.out.println(str);
        }

    }



    // define a function that returns things
    public static int add2(int x){
        return x + 2;

    }


    public static String str2(String x){
        return x + "!";
    }


}
