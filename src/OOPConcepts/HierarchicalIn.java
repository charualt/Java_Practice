package OOPConcepts;

class Employee{
    String name;
    double salary;

    Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    void work(){
        System.out.println(name + ":is working");
    }
}


class Developer extends Employee{

    Developer(String name, double salary) {
        super(name, salary);
    }

    void salaryOfDeveloper(){
        System.out.println("The salary of developer is ");

    }

}

class Manager extends Employee{

    Manager(String name, double salary) {
        super(name, salary);
    }

    void salaryOfManager(){
        System.out.println("The salary of manager is" + name + salary);
    }



}

public class HierarchicalIn {
    public static void main(String[] args) {
        Employee ee = new Manager("Rahul", 89000.67);
        ee.work();
    }
}
