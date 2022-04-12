package be.avidoo.patterns.passbyvalue;

public class MainPrimitivePassByValue {

    public static void main(String[] args) {
        int age = 35;
        transform(age);
        System.out.println(age);
    }

    /**
     * Primitive types are passed by value.
     * <p>
     * Primitive types are allocated in the stack memory, so only the local value will be changed. In this case, there is no object reference.
     */
    static void transform(int age) {
        // age here is a copy. It's not a object reference
        age = 10;
    }
}
