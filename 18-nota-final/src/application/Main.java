package application;

import entities.Grade;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Grade grade = new Grade();

        System.out.println("GRADE FINAL OF STUDENTS (0-100)");
        System.out.print("Name: ");
        grade.name = sc.nextLine();
        System.out.print("Grade One(0-30): ");
        grade.gradeOne = sc.nextDouble();
        System.out.print("Grade Two(0-35): ");
        grade.gradeTwo = sc.nextDouble();
        System.out.print("Grade Three(0-35): ");
        grade.gradeThree = sc.nextDouble();

        System.out.println();
        System.out.println(grade);


        sc.close();
    }
}
