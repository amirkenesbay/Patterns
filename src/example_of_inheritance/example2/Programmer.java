package example_of_inheritance.example2;

public class Programmer extends Company implements Employee{
    @Override
    public void doWork() {
        System.out.println("Programmer - writing a code;");
    }
}
