
public class Main {
    public static void main(String[] args) {
        PayrollSystem p1 = new PayrollSystem();
        Fulltimeemployee emp1 = new Fulltimeemployee("emp1" , 91, 5000  );
        PartTimeEmployee emp2 = new PartTimeEmployee("emp2" , 92 , 5 , 500);
        p1.addEmployee(emp1);
        p1.addEmployee(emp2);

        System.out.println("Current Employee Details");
        p1.displayEmployees();
        System.out.println("Removing Employee");
        p1.removeEmployee(92);
        System.out.println("Remainning Employee");
        p1.displayEmployees();
    }
}