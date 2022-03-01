package studentDatabaseApp;

import java.util.Scanner;

public class StudentDatabaseApp {

    public static void main(String[] args) {

        System.out.println("Enter number of new students to enroll: ");
        Scanner in = new Scanner(System.in);
        int numOfStudent = in.nextInt();
        Student[] students = new Student[numOfStudent];

        for(Student student:students){
            student = new Student();
            student.enroll();
            student.payTuition();
            System.out.println(student.showInfo());
        }
    }
}
