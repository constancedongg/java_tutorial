// apply things inside dog to cat
// dog is super class, and cat is sub class
public class cat extends dog {

    private int food;

    public cat(String name, int age, int food){
        super(name, age);
        this.food = food;

    }

    // without paramter food, use default value
    public cat(String name, int age){
        super(name, age);
        this.food = 50;
    }

    // without paramter food, use default value
    public cat(String name){
        super(name, 0);
    }

    public void speak(){

        System.out.println("Hellllo");

    }

    public void eat(int x){
        this.food -= x;
    }

}
