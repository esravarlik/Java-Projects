package studentDatabaseApp;
import java.util.Scanner;

public class Student {
    private static int id = 1001;
    private static int costOfCourse = 500;


    private int tuitionBalance;
    private String studentId;
    private String firstName;
    private String lastName;
    private String gradeYear;
    private String courses;

    public Student(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter student first name: ");
        this.firstName = in.nextLine();

        System.out.print("Enter student last name: ");
        this.lastName = in.nextLine();

        System.out.print("Enter student gradeYear: ");
        this.gradeYear = in.nextLine();

        setStudentId();
        System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentId);
    }

    private void setStudentId(){
        id++;
        this.studentId = (gradeYear + "" + id + "\n");
    }

    public void enroll(){
        boolean bool = true;
        while(bool) {
            System.out.println("Enter course to enroll (Q to quit): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("Q")) {
                courses = courses + "\n" + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            }
            if(course.equals("Q")){
                bool = false;
            }
        }
    }

    public void viewBalance(){
        System.out.println("Your balance is: $" + tuitionBalance);
    }

    public void payTuition(){
        viewBalance();
        System.out.println("Enter your payment: $");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for payment of $" + payment);
        viewBalance();
    }

    public String showInfo(){
        return "Name: " + firstName + " " + lastName +
                "\nGrade Level:" + gradeYear +
                "\nCourses Enrolled:" + courses +
                "\nStudent Id: " + studentId +
                "Balance: $" +  tuitionBalance;
    }
}
