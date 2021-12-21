public class Employee extends Person {

    private String jobTitle;

    public Employee(String fname, long salary, int a) {
        super(fname, salary, a);
    }

    @Override
    public double CalculateWeeklyIncome() {
        double total;
        total = salary * 7;
        return total;
    }

    @Override
    public double CalculateMonthlyIncome() {
        double total;
        total = salary * 30;
        return total;
    }
    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
    public double calculateYearlyIncome(){
        double total;
        total = salary * 365;
        return total;
    }
}
