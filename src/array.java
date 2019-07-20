import java.util.Arrays;
import java.util.ArrayList;

public class array {
    public static void main(String[] args) {

        // define a new integer array
        int [] x = {-99, 1, -2 , 10, 7};

        // changes x, sort x[1:4]
        Arrays.sort(x, 1, 4);

        for (int i:x){
            System.out.print(i + ",");

        }


        // define a new string array
        String[] newArr = new String[3];
        newArr[0] = "am";
        newArr[1] = "array";
        newArr[2] = "exists";

        for (String s:newArr){
            System.out.print(s + " ");
        }


    }

}
