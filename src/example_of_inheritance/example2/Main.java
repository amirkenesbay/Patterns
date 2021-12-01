package example_of_inheritance.example2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> companyList = new ArrayList<>();
        companyList.add(new Designer());
        companyList.add(new Programmer());
        companyList.add(new Tester());
        for (Employee e : companyList) {
            e.doWork();
        }
    }
}
