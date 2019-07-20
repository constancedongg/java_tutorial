import java.util.Arrays;

public class MeasurableTester {
    public static void main(String[] args){

        // Call the average method with an array of BankAccount
        Measurable[] accounts = new Measurable[4];
        accounts[0] = new BankAccount(800);
        accounts[1] = new BankAccount(100);
        accounts[2] = new BankAccount(1000);

        Arrays.sort(accounts);

        double averageBalance = Data.average(accounts);
        System.out.println("Average balance: " + averageBalance);
        System.out.println("Expected: 400");


        // Call the average method with an array of Country objects
//        Measurable[] countries = new Measurable[3];
//        countries[0] = new Country("Uruguay" , 176220);
//        countries[1] = new Country("Thailand" , 513120);
//        countries[2] = new Country("Japan" , 301523);
//
//        double averageArea = Data.average(countries);
//        System.out.println("Average area: " + averageArea);
//        System.out.println("Expected: 2232132");
//

    }

}
