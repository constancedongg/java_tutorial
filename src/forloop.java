import java.util.Scanner;

public class forloop {
    public static void main(String[] args) {

        for (int i = 0; i <= 10; i++){
            System.out.println(i);
        }


        for (int i = 0; i <= 10; i+=5){
            System.out.println(i);
        }


        int[] arr = {5,2,3,4};
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }



        for (int element:arr){
            System.out.println(element);

        }

        String[] names = new String[3];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < names.length; i++){
            System.out.print("Input: ");
            String input = sc.nextLine();
            names[i] = input;
        }

        for (String n:names){
            System.out.println(n);
            if (n.equals("tim")){
                break;
            }
        }



    }
}
