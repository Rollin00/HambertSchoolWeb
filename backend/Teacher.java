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
        student.setGrade(grade); // Assign grade to student
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

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
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
        return "Teacher{" +
               "teacherId='" + teacherId + '\'' +
               ", name='" + name + '\'' +
               '}';
    }
}
