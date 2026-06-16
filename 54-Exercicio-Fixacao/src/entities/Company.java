package entities;

public class Company extends Person {

    private int numberOfEmployees;

    public Company() {
        super();
    }

    public Company(String name, Double yearlyIncome, int numberOfEmployees) {
        super(name, yearlyIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public double tax() {
        if (numberOfEmployees <= 10) {
            return yearlyIncome * 0.16;
        } else {
            return yearlyIncome * 0.14;
        }
    }
}
