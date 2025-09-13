package OOPConcepts;

//Abstraction using interface

interface Vehicles{
    void start();
}

interface Automobiles{
    void speed();
}

class Cars implements Vehicles, Automobiles{

    @Override
    public void start() {
        System.out.println("It starts automaticlally");
    }

    @Override
    public void speed() {
        System.out.println("It has an amazing speed");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Cars c = new Cars();
        c.speed();
        c.start();
    }
}
