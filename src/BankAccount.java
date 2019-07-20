public class BankAccount implements Measurable{

    public double balance;
    public BankAccount(double balance){
        this.balance = balance;

    }

    public BankAccount() {}

    public double getMeasure(){
        return balance;
    }
}
