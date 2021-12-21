import java.util.Calendar;

public abstract class Person {
    protected String fullName;
    protected int age;
    protected long allowance; // daily in British pounds
    protected long salary;
    protected int currentYear = Calendar.getInstance().get(Calendar.YEAR);

    public Person(){

    }

    public  Person(String fName, int a, long allowance){
        fullName = fName;
        age = a;
        this.allowance = allowance;
    }

    public Person(String fname, long salary, int a){
        fullName = fname;
        this.salary = salary;
        age = a;
    }

    public abstract double CalculateWeeklyIncome();

    public abstract double CalculateMonthlyIncome();


}
