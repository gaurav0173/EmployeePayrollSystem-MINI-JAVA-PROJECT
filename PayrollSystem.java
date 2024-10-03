import java.util.ArrayList;

class PayrollSystem{
    private ArrayList<Employee> EmployeeList;

    public PayrollSystem(){

        EmployeeList = new ArrayList<>();

    }
    public void addEmployee(Employee employee){
        EmployeeList.add(employee);
    }
    public void removeEmployee(int id){
        Employee employeeToremove = null;
        for (Employee employee :  EmployeeList){
            if(employee.getId()== id){
                employeeToremove = employee;
                break;
            }
        }
        if (employeeToremove != null){
            EmployeeList.remove(employeeToremove);

        }
    }
    public void displayEmployees(){
        for (Employee employee : EmployeeList){
            System.out.println(employee);
        }
    }
}
