package OOPConcepts;


//example of using default method in interface parent and child
interface  Parent{
    default void sayHello(){
        System.out.println(
                "Hello"
        );
    }

    static void sayBye(){

    }
}

class Child implements Parent{
    @Override
    public void sayHello() {

    }
}

public class lambdaFunction implements Parent{
    //normal function

    public static void main(String[] args) {
        lambdaFunction lf = new lambdaFunction();
        Parent.sayBye();
    }

    //lambda function



}
