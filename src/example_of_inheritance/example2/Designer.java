package example_of_inheritance.example2;

public class Designer extends Company implements Employee {
    @Override
    public void doWork() {
        System.out.println("Designer - designing an architecture");
    }
}
