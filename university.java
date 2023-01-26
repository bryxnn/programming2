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

    public int getYearEstablished() {
        return yearEstablished;
    }

    public void setYearEstablished(int yearEstablished) {
        this.yearEstablished = yearEstablished;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public int getNumberOfFacultyMembers() {
        return numberOfFacultyMembers;
    }

    public void setNumberOfFacultyMembers(int numberOfFacultyMembers) {
        this.numberOfFacultyMembers = numberOfFacultyMembers;
    }

    public int getNumberOfFaculties() {
        return numberOfFaculties;
    }

    public void setNumberOfFaculties(int numberOfFaculties) {
        this.numberOfFaculties = numberOfFaculties;
    }

    public int getNumberOfDepartments() {
        return numberOfDepartments;
    }

    public void setNumberOfDepartments(int numberOfDepartments) {
        this.numberOfDepartments = numberOfDepartments;
    }

    public String[] getFacilities() {
        return facilities;
    }

    public void setFacilities(String[] facilities) {
        this.facilities = facilities;
    }
}

public class Main {
    public static void main(String[] args) {
        University defaultUniversity = new University();
        System.out.println("Name: " + defaultUniversity.getName());
        System.out.println("Year Established: " + defaultUniversity.getYearEstablished());
        System.out.println("Number of Students: " + defaultUniversity.getNumberOfStudents());
        System.out.println("Number of Faculty Members: " + defaultUniversity.getNumberOfFacultyMembers());
    }
}