public class Parent {

    private String parentId;
    private String name;

    // Constructor
    public Parent(String parentId, String name) {
        this.parentId = parentId;
        this.name = name;
    }

    // Method to track student progress
    public void trackProgress(Student student) {
        System.out.println("Tracking progress for " + student.getName());
        student.displayGrade();
        System.out.println("Attendance Status: " + student.getAttendanceStatus());
        System.out.println("Fees Paid: " + student.getFeesPaid());
        System.out.println("Remaining Fees Arrears: " + student.getFeesArrears());
    }

    // Method to communicate with teachers
    public void communicateWithTeacher(Teacher teacher, String message) {
        System.out.println("Message to teacher " + teacher.getName() + ": " + message);
    }

    // Getters and setters
    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Optional: Override toString() for easier logging or printing
    @Override
    public String toString() {
        return "Parent{" +
               "parentId='" + parentId + '\'' +
               ", name='" + name + '\'' +
               '}';
    }
}
