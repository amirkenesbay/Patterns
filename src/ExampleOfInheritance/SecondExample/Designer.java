package ExampleOfInheritance.SecondExample;

public class Designer extends Company implements Employee {
    @Override
    public void doWork() {
        System.out.println("Designer - designing an architecture");
    }
}
