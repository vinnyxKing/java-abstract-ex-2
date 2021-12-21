import javax.swing.*;

public class runClass {
    public static void main(String[] args) {
        Employee e1 = new Employee("Jack",70,30);
        Student s1 = new Student("Suzan",19,20);
        e1.setJobTitle("Computer Engineer");
        s1.setSchoolName("Cyprus International University");


        JOptionPane.showMessageDialog(null,"Monthly income of " +
                e1.fullName + " is " + e1.CalculateMonthlyIncome());
        JOptionPane.showMessageDialog(null,"Weekly income of " +
                e1.fullName + " is " + e1.CalculateWeeklyIncome());
        JOptionPane.showMessageDialog(null, "Monthly Income of " +
                s1.fullName + " is " + s1.CalculateMonthlyIncome());
        JOptionPane.showMessageDialog(null, "Weekly Income of " +
                s1.fullName + " is " + s1.CalculateWeeklyIncome());
        JOptionPane.showMessageDialog(null, "Yearly income of " +
                e1.fullName + " is " + e1.calculateYearlyIncome());

        JOptionPane.showMessageDialog(null,"The Birth year of " +
                s1.fullName + " is " + s1.calculateBirthYear());

    }


}
