import java.util.Scanner;

abstract class Student {
    private String name;
    private String surname;
    private int studentID;
    private double gpa;
    private double cgpa;
    private int semestersPassed;
    private String studyTime;

    // Default constructor
    public Student() {
        this.name = "";
        this.surname = "";
        this.studentID = 0;
        this.gpa = 0.00;
        this.cgpa = 0.00;
        this.semestersPassed = 0;
        this.studyTime = "";
    }

    // Constructor with input parameters
    public Student(String name, String surname, int studentID, double gpa, double cgpa, int semestersPassed) {
        this.name = name;
        this.surname = surname;
        this.studentID = studentID;
        this.gpa = gpa;
        this.cgpa = cgpa;
        this.semestersPassed = semestersPassed;
    }

    // Setter and Getter methods
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setGPA(double gpa) {
        this.gpa = gpa;
    }

    public double getGPA() {
        return gpa;
    }

    public void setCGPA(double cgpa) {
        this.cgpa = cgpa;
    }

    public double getCGPA() {
        return cgpa;
    }

    public void setSemestersPassed(int semestersPassed) {
        this.semestersPassed = semestersPassed;
    }

    public int getSemestersPassed() {
        return semestersPassed;
    }

    public void setStudyTime(String studyTime) {
        this.studyTime = studyTime;
    }

    public String getStudyTime() {
        return studyTime;
    }

    public void studentHealth() {
        System.out.println("Student health method called");
    }

    public void studentPsychological() {
        System.out.println("Student psychological method called");
    }
}

class SportiveStudent extends Student {
    public SportiveStudent() {
        super();
    }

    public SportiveStudent(String name, String surname, int studentID, double gpa, double cgpa, int semestersPassed) {
        super(name, surname, studentID, gpa, cgpa, semestersPassed);
    }

    public void studyTime() {
        System.out.println("Sportive Student study time method called");
    }
}

class BookWorm extends Student {
    public BookWorm() {
        super();
    }
    public BookWorm(String name, String surname, int studentID, double gpa, double cgpa, int semestersPassed) {
        super(name, surname, studentID, gpa, cgpa, semestersPassed);
    }

    public void studyTime() {
        System.out.println("Bookworm Student study time method called");
    }
}

class InternationalStudent extends Student {
    public InternationalStudent() {
        super();
    }

    public InternationalStudent(String name, String surname, int studentID, double gpa, double cgpa, int semestersPassed) {
        super(name, surname, studentID, gpa, cgpa, semestersPassed);
    }

    public void studyTime() {
        System.out.println("International Student study time method called");
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SportiveStudent sportStu = new SportiveStudent();
        BookWorm bookWorm = new BookWorm();
        InternationalStudent intStu = new InternationalStudent();
        System.out.println("Enter sportive student name: ");
        sportStu.setName(sc.nextLine());
        System.out.println("Enter sportive student surname: ");
        sportStu.setSurname(sc.nextLine());
        System.out.println("Enter sportive student ID: ");
        sportStu.setStudentID(sc.nextInt());
        System.out.println("Enter sportive student GPA: ");
        sportStu.setGPA(sc.nextDouble());
        System.out.println("Enter sportive student CGPA: ");
        sportStu.setCGPA(sc.nextDouble());
        System.out.println("Enter sportive student semesters passed: ");
        sportStu.setSemestersPassed(sc.nextInt());
        sc.nextLine();
        System.out.println("Enter sportive student study time: ");
        sportStu.studyTime();
        System.out.println("Sportive Student's name: " + sportStu.getName());
        System.out.println("Sportive Student's surname: " + sportStu.getSurname());
        System.out.println("Sportive Student's ID: " + sportStu.getStudentID());
        System.out.println("Sportive Student's GPA: " + sportStu.getGPA());
        System.out.println("Sportive Student's CGPA: " + sportStu.getCGPA());
        System.out.println("Sportive Student's semesters passed: " + sportStu.getSemestersPassed());
        System.out.println("Enter bookworm student name: ");
        bookWorm.setName(sc.nextLine());
        System.out.println("Enter bookworm student surname: ");
        bookWorm.setSurname(sc.nextLine());
        System.out.println("Enter bookworm student ID: ");
        bookWorm.setStudentID(sc.nextInt());
        System.out.println("Enter bookworm student GPA: ");
        bookWorm.setGPA(sc.nextDouble());
        System.out.println("Enter bookworm student CGPA: ");
        bookWorm.setCGPA(sc.nextDouble());
        System.out.println("Enter bookworm student semesters passed: ");
        bookWorm.setSemestersPassed(sc.nextInt());
        sc.nextLine();
        System.out.println("Enter bookworm student study time: ");
        bookWorm.studyTime();
        System.out.println("Bookworm Student's name: " + bookWorm.getName());
        System.out.println("Bookworm Student's surname: " + bookWorm.getSurname());
        System.out.println("Bookworm Student's ID: " + bookWorm.getStudentID());
        System.out.println("Bookworm Student's GPA: " + bookWorm.getGPA());
        System.out.println("Bookworm Student's CGPA: " + bookWorm.getCGPA());
        System.out.println("Bookworm Student's semesters passed: " + bookWorm.getSemestersPassed());

        System.out.println("Enter international student name: ");
        intStu.setName(sc.nextLine());
        System.out.println("Enter international student surname: ");
        intStu.setSurname(sc.nextLine());
        System.out.println("Enter international student ID: ");
        intStu.setStudentID(sc.nextInt());
        System.out.println("Enter international student GPA: ");
        intStu.setGPA(sc.nextDouble());
        System.out.println("Enter international student CGPA: ");
        intStu.setCGPA(sc.nextDouble());
        System.out.println("Enter international student semesters passed: ");
        intStu.setSemestersPassed(sc.nextInt());
        sc.nextLine();
        System.out.println("Enter international student study time: ");
        intStu.studyTime();
        System.out.println("International Student's name: " + intStu.getName());
        System.out.println("International Student's surname: " + intStu.getSurname());
        System.out.println("International Student's ID: " + intStu.getStudentID());
        System.out.println("International Student's GPA: " + intStu.getGPA());
        System.out.println("International Student's CGPA: " + intStu.getCGPA());
        System.out.println("International Student's semesters passed: " + intStu.getSemestersPassed());
        sc.close();
    }
}

