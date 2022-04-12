package be.avidoo.patterns.passbyvalue;

public class MainObjectPassByValue {

    public static void main(String[] args) {
        Person lebron = new Person("Lebron");
        transform(lebron);
        System.out.println(lebron.getName());
    }

    /**
     * Person is passed by value.
     * <p>
     * The reason is that Java object variables are simply references that point to real objects in the memory heap.
     * Therefore, even though Java passes parameters to methods by value, if the variable points to an object reference,
     * the real object will also be changed.
     */
    static void transform(Person person) {
        person.setName("Kevin");
    }
}
