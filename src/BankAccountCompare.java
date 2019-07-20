public class BankAccountCompare implements Comparable {

    public double balance;

    public int compareTo(Object otherObject){
        BankAccount ohter = (BankAccount) otherObject;
        if (balance < other.balance){
            return -1;
        }
        if (balance > other.balance){
            return 1;
        }
        return 0;
    }
}
