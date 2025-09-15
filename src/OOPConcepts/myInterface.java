package OOPConcepts;

@FunctionalInterface
public interface myInterface {

    //allow only one abstract method
    public void sayHello();

    //any number of static and default methods are allowed
    public static void sayBye(){};
}
