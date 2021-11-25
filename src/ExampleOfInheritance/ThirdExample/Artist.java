package ExampleOfInheritance.ThirdExample;

public class Artist extends GameDevCompany implements Employee{
    @Override
    public void doWork() {
        System.out.println("Artist - drawing an architecture");
    }
}
