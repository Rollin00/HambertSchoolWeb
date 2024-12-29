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
    }

    // Method to communicate with teachers
    public void communicateWithTeacher(Teacher teacher, String message) {
        System.out.println("Message to teacher " + teacher.getName() + ": " + message);
    }

    // Getters and setters
    public String getParentId() {
        return parentId;
    }

    public String getName() {
        return name;
    }
}
