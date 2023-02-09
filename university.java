class University {
    private String name;
    private int yearEstablished;
    private int numberOfStudents;
    private int numberOfFacultyMembers;
    private int numberOfFaculties;
    private int numberOfDepartments;
    private String facility1;
    private String facility2;
    private String facility3;

    public University() {
        this.name = "";
        this.yearEstablished = 0;
        this.numberOfStudents = 0;
        this.numberOfFacultyMembers = 0;
        this.numberOfFaculties = 0;
        this.numberOfDepartments = 0;
        this.facility1 = "";
        this.facility2 = "";
        this.facility3 = "";
    }

    public University(String name, int yearEstablished, int numberOfStudents, int numberOfFacultyMembers, int numberOfFaculties, int numberOfDepartments, String facility1, String facility2, String facility3) {
        this.name = name;
        this.yearEstablished = yearEstablished;
        this.numberOfStudents = numberOfStudents;
        this.numberOfFacultyMembers = numberOfFacultyMembers;
        this.numberOfFaculties = numberOfFaculties;
        this.numberOfDepartments = numberOfDepartments;
        this.facility1 = facility1;
        this.facility2 = facility2;
        this.facility3 = facility3;
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

    public String getFacility1() {
        return facility1;
    }

    public void setFacility1(String facility1) {
        this.facility1 = facility1;
    }

    public String getFacility2() {
        return facility2;
    }

    public void setFacility2(String facility2) {
        this.facility2 = facility2;
    }

    public String getFacility3() {
        return facility3;
    }

    public void setFacility3(String facility3) {
        this.facility3 = facility3;
    }
}

class Main {
    public static void main(String[] args) {
        University univ1 = new University();
        System.out.println("Name: " + univ1.getName());
        System.out.println("Year Established: " + univ1.getYearEstablished());
        System.out.println("Number of Students: " + univ1.getNumberOfStudents());
        System.out.println("Number of Faculty Members: " + univ1.getNumberOfFacultyMembers());
        System.out.println("Number of Faculties: " + univ1.getNumberOfFaculties());
        System.out.println("Number of Departments: " + univ1.getNumberOfDepartments());
        System.out.println("Facility 1: " + univ1.getFacility1());
        System.out.println("Facility 2: " + univ1.getFacility2());
        System.out.println("Facility 3: " + univ1.getFacility3());

        University univ2 = new University("University of XYZ", 1990, 10000, 500, 10, 50, "Library", "Gym", "Auditorium");
        System.out.println("Name: " + univ2.getName());
        System.out.println("Year Established: " + univ2.getYearEstablished());
        System.out.println("Number of Students: " + univ2.getNumberOfStudents());
        System.out.println("Number of Faculty Members: " + univ2.getNumberOfFacultyMembers());
        System.out.println("Number of Faculties: " + univ2.getNumberOfFaculties());
        System.out.println("Number of Departments: " + univ2.getNumberOfDepartments());
        System.out.println("Facility 1: " + univ2.getFacility1());
        System.out.println("Facility 2: " + univ2.getFacility2());
        System.out.println("Facility 3: " + univ2.getFacility3());

        univ2.setName("University of ABC");
        univ2.setYearEstablished(2000);
        univ2.setNumberOfStudents(15000);
        univ2.setNumberOfFacultyMembers(800);
        univ2.setNumberOfFaculties(15);
        univ2.setNumberOfDepartments(70);
        univ2.setFacility1("Swimming Pool");
        univ2.setFacility2("Tennis Court");
        univ2.setFacility3("Cafeteria");

        System.out.println("Name: " + univ2.getName());
        System.out.println("Year Established: " + univ2.getYearEstablished());
        System.out.println("Number of Students: " + univ2.getNumberOfStudents());
        System.out.println("Number of Faculty Members: " + univ2.getNumberOfFacultyMembers());
        System.out.println("Number of Faculties: " + univ2.getNumberOfFaculties());
        System.out.println("Number of Departments: " + univ2.getNumberOfDepartments());
        System.out.println("Facility 1: " + univ2.getFacility1());
        System.out.println("Facility 2: " + univ2.getFacility2());
        System.out.println("Facility 3: " + univ2.getFacility3());
    }
}


 
   
