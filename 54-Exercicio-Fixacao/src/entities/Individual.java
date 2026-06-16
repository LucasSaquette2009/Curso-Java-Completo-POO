package entities;

public class Individual extends Person {

    private double healthExpenditures;

    public Individual() {
    }

    public Individual(String name, Double anualIncome, double healthExpenditures) {
        super(name, anualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public double tax() {
        if (yearlyIncome < 20000.00) {
            return yearlyIncome * 0.15 - healthExpenditures * 0.5;
        } else {
            return yearlyIncome * 0.25 - healthExpenditures * 0.5;
        }
    }
}
