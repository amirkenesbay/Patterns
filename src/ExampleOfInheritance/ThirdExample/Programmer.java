package ExampleOfInheritance.ThirdExample;

public class Programmer extends OutsourcingCompany implements Employee{
    @Override
    public void doWork() {
        System.out.println("Programmer - writing a code;");
    }
}
