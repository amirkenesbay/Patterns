package example_of_inheritance.example2;

public class Tester extends Company implements Employee{
    @Override
    public void doWork() {
        System.out.println("Tester - testing a software");
    }
}
