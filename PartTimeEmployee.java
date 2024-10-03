public class PartTimeEmployee extends Employee{
    private int hourswork;
    private double hourlyrate;

    public PartTimeEmployee(String name , int id , int hourswork , double hourslyrate) {
        super(name, id);
        this.hourswork = hourswork;
        this.hourlyrate = hourslyrate;
    }
        @Override
        public double calculatesalary(){
        return hourswork * hourlyrate;
        }


}
