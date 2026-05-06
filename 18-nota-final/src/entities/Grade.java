package entities;

public class Grade {
    public String name;
    public double gradeOne;
    public double gradeTwo;
    public double gradeThree;

    public double gradeAdded() {
        return gradeOne + gradeTwo + gradeThree;
    }

    public double missingPoints() {
        return 60.00 - gradeAdded();
    }

    public String passOrFailed() {
        if (gradeAdded() < 60) {
            return String.format("FAILED%n" +
                    "MISSING %.2f POINTS", missingPoints());
        }
        else if (gradeAdded() > 100) {
            return "INVALID GRADE";
        }
        else {
            return "PASS";
        }
    }

    public String toString() {
        return String.format("FINAL GRADE = %.2f%n" +
                "%s", gradeAdded(), passOrFailed());
    }
}
