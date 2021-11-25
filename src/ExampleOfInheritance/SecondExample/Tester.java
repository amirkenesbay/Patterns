package ExampleOfInheritance.SecondExample;

public class Tester extends Company implements Employee{
    @Override
    public void doWork() {
        System.out.println("Tester - testing a software");
    }
}
