package be.avidoo.patterns.passbyvalue;

public class MainStringPassByValue {

    public static void main(String[] args) {
        String name = "Lebron";
        transform(name);
        System.out.println(name);
    }

    /**
     * A String object is immutable, which means that the fields inside the String are final and can’t be changed.
     */
    static void transform(String name) {
        // age here is a copy. It's not a object reference
        name = "Kevin";
        // this var will be garbage collected as soon as the method exits
    }
}
