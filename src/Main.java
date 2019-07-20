public class Main {

    public static void main(String[] args) {
	    // create integer array with length 5, cannot change the length

        // create an instance of dog, the instance is named tim
        dog tim = new dog("Tim" , 4);
        tim.speak();

        dog bill = new dog("Bill" , 7);
        bill.speak();

        dog bob = new dog("Bob" , 10);
        bob.speak();

        int x = tim.getAge();
        System.out.println(x);

        tim.setAge(10);
        tim.speak();

    }
}
