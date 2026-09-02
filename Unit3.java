import java.util.Scanner;

public class Unit3 {
    public static void main(String[] args) {
        boolean pass = false;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a grade: ");
        double grade = input.nextDouble();

        String letterGrade = new String("");

        // Boolean comparison operators (==, !=, >, <, >=, <=)
        // Boolean logical operators (&&, ||, !)

        if (grade >= 100.0) {
            letterGrade = "A+";
            pass = true;
        } else if (grade >= 90.0) {
            if (grade >= 92) {
                letterGrade = "A";
            } else {
                letterGrade = "A-";
            }
            pass = true;
        } else if (grade >= 80.0) {
            if (grade >= 95) {
                letterGrade = "B+";
            } else if (grade >= 92) {
                letterGrade = "B";
            } else {
                letterGrade = "B-";
            }
            pass = true;
        } else if (grade >= 70.0) {
           if (grade >= 95) {
                letterGrade = "C+";
            } else if (grade >= 92) {
                letterGrade = "C";
            } else {
                letterGrade = "C-";
            }
            pass = true;
        } else if (grade >= 60.0) {
            if (grade >= 95) {
                letterGrade = "D+";
            } else if (grade >= 92) {
                letterGrade = "D";
            } else {
                letterGrade = "D-";
            }
            pass = false;
        } else {
            letterGrade = "F";
            pass = false;
        }

        System.out.println(letterGrade);
    }
}