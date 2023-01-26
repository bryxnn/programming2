public class University {
    private String name;
    private int yearEstablished;
    private int numberOfStudents;
    private int numberOfFacultyMembers;
    private int numberOfFaculties;
    private int numberOfDepartments;
    private String[] facilities;

    public University() {
        this.name = "";
        this.yearEstablished = 0;
        this.numberOfStudents = 0;
        this.numberOfFacultyMembers = 0;
        this.numberOfFaculties = 0;
        this.numberOfDepartments = 0;
        this.facilities = new String[3];
    }

    public University(String name, int yearEstablished, int numberOfStudents, int numberOfFacultyMembers, int numberOfFaculties, int numberOfDepartments, String[] facilities) {
        this.name = name;
        this.yearEstablished = yearEstablished;
        this.numberOfStudents = numberOfStudents;
        this.numberOfFacultyMembers = numberOfFacultyMembers;
        this.numberOfFaculties = numberOfFaculties;
        this.numberOfDepartments = numberOfDepartments;
        this.facilities = facilities;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}