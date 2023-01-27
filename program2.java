import java.util.Scanner;
abstract class Information{
    public static Scanner keyboard = new Scanner(System.in);
    private String firstName;
    private String lastName;
    private int studentID;
    private double studentGPA;
    private double studentCGPA;
    private int studentSemesters;
    private String studyTime;

    public Information() {
        this.firstName = "";
        this.lastName = "";
        this.studentID = 0;
        this.studentGPA = 0.00;
        this.studentCGPA = 0.00;
        this.studentSemesters = 0;
        this.studyTime = "";
    }
    public Information(String firstName, String lastName, int studentID, double studentGPA, double studentCGPA, int studentSemesters, String studyTime) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentID = studentID;
        this.studentGPA = studentGPA;
        this.studentCGPA = studentCGPA;
        this.studentSemesters = studentSemesters;
        this.studyTime = studyTime;

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public double getStudentGPA() {
        return studentGPA;
    }

    public void setStudentGPA(double studentGPA) {
        this.studentGPA = studentGPA;
    }

    public double getStudentCGPA() {
        return studentCGPA;
    }

    public void setStudentCGPA(double studentCGPA) {
        this.studentCGPA = studentCGPA;
    }

    public int getStudentSemesters() {
        return studentSemesters;
    }

    public void setStudentSemesters(int studentSemesters) {
        this.studentSemesters = studentSemesters;
    }

    public String getStudyTime() {
        return studyTime;
    }

    public void setStudyTime(String studyTime) {
        this.studyTime = studyTime;
    }

    abstract void studentHealth();
    abstract void studentPsychologicalConditions();

    @Override
    public String toString() {
        return
                "First Name: " + firstName +
                        "\nLast Name: " + lastName +
                        "\nStudent ID: " + studentID +
                        "\nStudent GPA: " + studentGPA +
                        "\nStudent CGPA: " + studentCGPA +
                        "\nNumber of Semesters Passed: " + studentSemesters +
                        "\nStudy Time: " + studyTime;
    }
}
class sportiveStudent extends Information{
    public sportiveStudent(){
        super();
    }
    public sportiveStudent(String firstName, String lastName, int studentID, int studentGPA, int studentCGPA, int studentSemesters, String studyTime){
        super(firstName,lastName,studentID, studentGPA, studentCGPA, studentSemesters, studyTime);
    }
    public void studentHealth(){
        System.out.println("Sportive Student Health: Healthy");
    }

    public void studentPsychologicalConditions(){
        System.out.println("Sportive Student Psychological Conditions: Good");
    }
}

class bookWorm extends Information{
    public bookWorm(){
        super();
    }
    public bookWorm(String firstName, String lastName, int studentID, int studentGPA, int studentCGPA, int studentSemesters, String studyTime) {
        super(firstName,lastName,studentID, studentGPA, studentCGPA, studentSemesters, studyTime);
    }
    public void studentHealth(){
        System.out.println("BookWorm Student Health: Healthy");
    }

    public void studentPsychologicalConditions(){
        System.out.println("BookWorm Student Psychological Conditions: Exhausted");
    }
}

class internationalStudent extends Information {
    public internationalStudent() {
        super();
    }

    public internationalStudent(String firstName, String lastName, int studentID, int studentGPA, int studentCGPA, int studentSemesters, String studyTime) {
        super(firstName, lastName, studentID, studentGPA, studentCGPA, studentSemesters, studyTime);

    }

    public void studentHealth() {
        System.out.println("International Student Health: Healthy");
    }

    public void studentPsychologicalConditions() {
        System.out.println("International Student Psychological Conditions: Home Sick");
    }
}