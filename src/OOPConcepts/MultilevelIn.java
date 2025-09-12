package OOPConcepts;

class Vehicle{
    void start(){
        System.out.println("Every vehicle starts on its own.");
    }
}

class Car extends Vehicle{

    void start(){
        System.out.println("Car starts on its own");
    }
}

class Electric extends Car{
    void start(){
        System.out.println("Car is running on its own");
    }
}

public class MultilevelIn {
    public static void main(String[] args) {
        Vehicle v = new Electric();
        v.start();
    }
}
