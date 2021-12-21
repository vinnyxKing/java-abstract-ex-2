public class Student extends Person{

    private String SchoolName;

    public Student(String fName, int a, long allowance) {
        super(fName, a, allowance);
    }

    @Override
    public double CalculateWeeklyIncome() {
        double total;
        total = allowance * 7;
        return total;
    }

    @Override
    public double CalculateMonthlyIncome() {
        return allowance * 30;
    }
    public String getSchoolName() {
        return SchoolName;
    }

    public void setSchoolName(String schoolName) {
        SchoolName = schoolName;
    }

    public int calculateBirthYear(){
        return currentYear - age;
    }

}
