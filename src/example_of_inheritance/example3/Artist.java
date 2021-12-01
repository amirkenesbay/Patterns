package example_of_inheritance.example3;

public class Artist extends GameDevCompany implements Employee{
    @Override
    public void doWork() {
        System.out.println("Artist - drawing an architecture");
    }
}
