package example_of_inheritance.example3;

public class Designer extends GameDevCompany implements Employee{
    @Override
    public void doWork() {
        System.out.println("Designer - designing an architecture");
    }
}
