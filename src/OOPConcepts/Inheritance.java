package OOPConcepts;

class Animal{
    void eat(){
        System.out.println("Eating is done by all animals");
    }
}

class Lion extends Animal{
    void bark(){
        System.out.println("Lion only roars");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Lion l = new Lion();
        l.bark();
        l.eat();
    }

}
