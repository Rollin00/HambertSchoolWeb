public class Teacher {

    private String teacherId;
    private String name;

    // Constructor
    public Teacher(String teacherId, String name) {
        this.teacherId = teacherId;
        this.name = name;
    }

    // Method to assign grades to students
    public void assignGrade(Student student, String grade) {
        student.displayGrade();
        System.out.println("Assigned grade: " + grade + " to student " + student.getName());
    }

    // Method for teacher-student communication
    public void communicateWithStudent(Student student, String message) {
        System.out.println("Message to " + student.getName() + ": " + message);
    }

    // Getters and setters
    public String getTeacherId() {
        return teacherId;
    }

    public String getName() {
        return name;
    }
}
