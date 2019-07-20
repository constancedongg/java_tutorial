/*
Generic programming.

ArrayList and LinkedList: generic classes; Each of these classes has a type parameter for specifying the type of its elements,
                        e.g. an ArrayList<String> stores String elements.

ArrayList<E>, where E is the type variable that denotes the element type, ArrayList<E> class can declare methods:
            public void add(E element)
            public E get(int index)

* Cannot substitute any of the eight primitive types for a type parameter, error: ArrayList<double>.
  Use the corresponding wrapper class instead, such as ArrayList<Double>.


Examples:
1. HashMap<K, V> with key type K and value type V. Declare a hash map that maps strings to integers.

2.
// supply a variable for each type parameter, here T is variable for a type
public class Pair<T, S>{

    // instance variables with a variable data type
    private T first;
    private S second;

    // method with a variable return type
    public T getFirst(){ return first; }
}

 */


// T, S is variable types like int, double
public class Pair<T, S> {
    // first is a variable with type T
    private T first;
    private S second;

    // firstElement is a variable with type T
    public Pair(T firstElement, S secondElement){
        first = firstElement;
        second = secondElement;
    }

    public T getFirst(){
        return first;
    }

    public S getSecond(){
        return second;
    }

    public String toString(){
        return "(" + first + "," + second +")" ;
    }

}
