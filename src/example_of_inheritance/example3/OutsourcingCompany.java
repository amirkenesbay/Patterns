package example_of_inheritance.example3;

import java.util.ArrayList;
import java.util.List;

public class OutsourcingCompany extends Company{
    @Override
    public void getEmployees(){
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Programmer());
        employeeList.add(new Tester());
        for (Employee employee : employeeList){
            employee.doWork();
        }
    }
}
