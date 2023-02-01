import java.util.Scanner;

public class Driver {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        sportiveStudent newSportStudent = new sportiveStudent();
        bookWorm newBookWorm = new bookWorm();
        internationalStudent newIntStudent = new internationalStudent();
        System.out.println("Enter Sportive Student first name: ");
        newSportStudent.setFirstName(keyboard.nextLine());
        System.out.println("Enter Sportive Student last name: ");
        newSportStudent.setLastName(keyboard.nextLine());
        System.out.println("Enter Sportive Student ID: ");
        newSportStudent.setStudentID(keyboard.nextInt());
        keyboard.nextLine();
        System.out.println("Enter Sportive Student GPA: ");
        newSportStudent.setStudentGPA(keyboard.nextDouble());
        keyboard.nextLine();
        System.out.println("Enter Sportive Student CGPA: ");
        newSportStudent.setStudentCGPA(keyboard.nextDouble());
        keyboard.nextLine();
        System.out.println("Enter Sportive Student Semester's Passed: ");
        newSportStudent.setStudentSemesters(keyboard.nextInt());
        keyboard.nextLine();
        System.out.println("Enter the amount of time that the student studied for: Example: 6.5 hours");
        newSportStudent.setStudyTime(keyboard.nextLine());


        System.out.println("Enter Bookworm Student First name: ");
        newBookWorm.setFirstName(keyboard.nextLine());
        System.out.println("Enter Bookworm Student Last Name: ");
        newBookWorm.setLastName(keyboard.nextLine());
        System.out.println("Enter Bookworm Student ID: ");
        newBookWorm.setStudentID(keyboard.nextInt());
        keyboard.nextLine();
        System.out.println("Enter Bookworm student GPA: ");
        newBookWorm.setStudentGPA(keyboard.nextDouble());
        keyboard.nextLine();
        System.out.println("Enter Bookworm student CGPA: ");
        newBookWorm.setStudentCGPA(keyboard.nextDouble());
        keyboard.nextLine();
        System.out.println("Enter Bookworm student semesters passed: ");
        newBookWorm.setStudentSemesters(keyboard.nextInt());
        keyboard.nextLine();
        System.out.println("Enter the amount of time that the student studied for: Example: 6.5 hours");
        newBookWorm.setStudyTime(keyboard.nextLine());

        System.out.println("Enter International Student First Name: ");
        newIntStudent.setFirstName(keyboard.nextLine());
        System.out.println("Enter International Student Last Name: ");
        newIntStudent.setLastName(keyboard.nextLine());
        System.out.println("Enter International Student ID: ");
        newIntStudent.setStudentID(keyboard.nextInt());
        keyboard.nextLine();
        System.out.println("Enter International Student GPA: ");
        newIntStudent.setStudentGPA(keyboard.nextDouble());
        keyboard.nextLine();
        System.out.println("Enter International Student CGPA: ");
        newIntStudent.setStudentCGPA(keyboard.nextDouble());
        keyboard.nextLine();
        System.out.println("Enter International Student semesters passed: ");
        newIntStudent.setStudentSemesters(keyboard.nextInt());
        keyboard.nextLine();
        System.out.println("Enter the amount of time that the student studied for: Example: 6.5 hours");
        newIntStudent.setStudyTime(keyboard.nextLine());

        System.out.println();
        System.out.println("Sportive Student");
        System.out.println(newSportStudent);
        newSportStudent.studentHealth();
        newSportStudent.studentPsychologicalConditions();

        System.out.println();
        System.out.println("Book Worm");
        System.out.println(newBookWorm);
        newBookWorm.studentHealth();
        newBookWorm.studentPsychologicalConditions();

        System.out.println();
        System.out.println("International Student");
        System.out.println(newIntStudent);
        newIntStudent.studentHealth();
        newIntStudent.studentPsychologicalConditions();
    }
}