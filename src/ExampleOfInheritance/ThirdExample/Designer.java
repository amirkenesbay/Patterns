package ExampleOfInheritance.ThirdExample;

public class Designer extends GameDevCompany implements Employee{
    @Override
    public void doWork() {
        System.out.println("Designer - designing an architecture");
    }
}
