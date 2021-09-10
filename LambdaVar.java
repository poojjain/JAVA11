import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaVar {

    public static void main(String[] args) {
        LambdaVar lambdaVar = new LambdaVar();
        List<Employee> employeeList = new ArrayList<>();
        lambdaVar.populateList(employeeList);
        /*for(var emp: employeeList) {
            System.out.println(emp.getEmpName());
        }*/

        List<String> techList = Arrays.asList("Java", "Spring", "Angular", "MongoDb");
        //String finalList = techList.stream().filter((var s) -> s.length() != 0).collect(Collectors.joining(","));
        System.out.println(techList.toString());

        //techList = updateVersion(techList);
        System.out.println(techList.toString());
    }

   /* private static List<String> updateVersion(List<String> techList) {
        var version = "_new";
        return techList.stream().map(s -> s+version).collect(Collectors.toList());
    }*/

    private void populateList(List<Employee> employeeList) {
        Employee emp = new Employee("First Employee");
        employeeList.add(emp);
        emp = new Employee("Second Employee");
        employeeList.add(emp);
        emp = new Employee("Third Employee");
        employeeList.add(emp);
        emp = new Employee("Fourth Employee");
        employeeList.add(emp);
        emp = new Employee("Five Employee");
        employeeList.add(emp);
    }

}

class Employee {
    private String empName;

    public Employee(String empName) {
        this.empName = empName;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }
}
