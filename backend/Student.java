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
        this.feesArrears = 1000; // Initial arrears set to total fee
    }

    // Methods for grade display, attendance tracking, and fee management
    public void displayGrade() {
        System.out.println("Student Grade: " + grade);
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void updateAttendance(String status) {
        this.attendanceStatus = status;
        System.out.println("Attendance for student " + name + " is " + status);
    }

    public void updateFees(double amount) {
        if (amount + this.feesPaid <= 1000) { // Prevent overpayment
            this.feesPaid += amount;
            this.feesArrears = 1000 - this.feesPaid;
            System.out.println("Fees updated. Remaining arrears: " + this.feesArrears);
        } else {
            System.out.println("Amount exceeds the total fees. Please adjust.");
        }
    }

    // Getters and setters
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public String getAttendanceStatus() {
        return attendanceStatus;
    }

    public double getFeesPaid() {
        return feesPaid;
    }

    public double getFeesArrears() {
        return feesArrears;
    }

    // Optional: Override toString() for easier logging or printing
    @Override
    public String toString() {
        return "Student{" +
               "studentId='" + studentId + '\'' +
               ", name='" + name + '\'' +
               ", grade='" + grade + '\'' +
               ", attendanceStatus='" + attendanceStatus + '\'' +
               ", feesPaid=" + feesPaid +
               ", feesArrears=" + feesArrears +
               '}';
    }
}
