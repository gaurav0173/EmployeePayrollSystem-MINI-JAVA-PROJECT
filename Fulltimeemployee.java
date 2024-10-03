public class Fulltimeemployee extends Employee {
    private double monthlysalary;
    public Fulltimeemployee(String name , int id , double monthlysalary){
        super(name , id );
        this.monthlysalary = monthlysalary;

    }
    @Override
    public double  calculatesalary(){
        return monthlysalary;

    }
}
