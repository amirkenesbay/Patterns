package prototype.example2;

public class Demo {
    public static void main(String[] args) {
        int id = 1;
        String name = "Amir";
        String designation = "Test";
        String address = "TestAddress";
        double salary = 4545.4545;

        EmployeeRecord e1 = new EmployeeRecord(id, name, designation, salary, address);
        e1.showRecord();

        System.out.println("\nFirst clone");
        EmployeeRecord e2 = (EmployeeRecord) e1.getClone();
        e2.showRecord();

        System.out.println("\nSecond clone");
        EmployeeRecord e3 = (EmployeeRecord) e2.getClone();
        e3.showRecord();
    }
}
