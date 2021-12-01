package example_of_inheritance.example3;

import java.util.ArrayList;
import java.util.List;

public class GameDevCompany extends Company {
    @Override
    public void getEmployees() {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Artist());
        employeeList.add(new Designer());
        for (Employee employee : employeeList) {
            employee.doWork();
        }
    }
}
