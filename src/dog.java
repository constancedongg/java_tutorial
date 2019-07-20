public class dog {

    // private ensures name and age are only accessible within dog
    private String name;
    private int age;

    // must has this to use extends in cat.java
    public dog (){}

    public dog(String name, int age){

        // this refers to the attribute in dog
        this.name = name;
        this.age = age;
        add2();
    }


    public void speak(){
        System.out.println("I am " + this.name + " and I am " + this.age + " years old.");


    }



    public int getAge(){
        return this.age;

    }

    public void setAge(int age){
        this.age = age;

    }


    // private method can only be used inside the class
    private int add2(){
        return this.age + 2;
    }

}
