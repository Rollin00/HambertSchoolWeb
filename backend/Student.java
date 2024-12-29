public class Student {

    private String studentId;
    private String name;
    private String grade;
    private String attendanceStatus;
    private double feesPaid;
    private double feesArrears;

    // Constructor
    public Student(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
        this.grade = "Not Available";
        this.attendanceStatus = "Not Recorded";
        this.feesPaid = 0;
        this.feesArrears = 0;
    }

    // Methods for grade display, attendance tracking, and fee management
    public void displayGrade() {
        System.out.println("Student Grade: " + grade);
    }

    public void updateAttendance(String status) {
        this.attendanceStatus = status;
        System.out.println("Attendance for student " + name + " is " + status);
    }

    public void updateFees(double amount) {
        this.feesPaid += amount;
        this.feesArrears = 1000 - this.feesPaid; // Example fee management
        System.out.println("Fees updated. Remaining arrears: " + this.feesArrears);
    }

    // Getters and setters
    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }
}
