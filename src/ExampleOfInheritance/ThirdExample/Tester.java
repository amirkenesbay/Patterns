package ExampleOfInheritance.ThirdExample;

public class Tester extends OutsourcingCompany implements Employee{
    @Override
    public void doWork() {
        System.out.println("Tester - testing a software");
    }
}
