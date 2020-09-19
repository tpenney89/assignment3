package tpenney;

/*
 * Implements GenericContainer to assigns type and value
 */

public class MyGenericContainer {

    public static void main(String[] args) {
        GenericContainer<String> a = new GenericContainer<String>("Tom");
        a.getValue(); //returns a String value of Tom

        GenericContainer<Integer> b = new GenericContainer<Integer>(31);
        b.getValue(); // return an Integer value of 31
    }
}
