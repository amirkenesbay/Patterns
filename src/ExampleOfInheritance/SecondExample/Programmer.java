package ExampleOfInheritance.SecondExample;

public class Programmer extends Company implements Employee{
    @Override
    public void doWork() {
        System.out.println("Programmer - writing a code;");
    }
}
