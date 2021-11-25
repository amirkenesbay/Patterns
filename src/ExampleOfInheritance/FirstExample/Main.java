package ExampleOfInheritance.FirstExample;

public class Main {
    public static void main(String[] args) {
        Company company = new Company();
        company.createSoftware();
        Designer designer = new Designer();
        designer.designArchitecture();
        Programmer programmer = new Programmer();
        programmer.writeCode();
        Tester tester = new Tester();
        tester.testSoftware();
    }
}
