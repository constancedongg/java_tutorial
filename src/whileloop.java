import java.util.Scanner;

public class whileloop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Type a number: ");
        int x = sc.nextInt();


        while (x != 10){
            System.out.println(x);
            x = sc.nextInt();

        }




        do {
            System.out.println("Type a number: ");
            x = sc.nextInt();
        } while (x != 10);


        int count = 0;
        while (count < 10){
            System.out.println(count);
            count++;
        }
    }
}