// Function for teachers to assign grades
function assignGrade(studentId, grade) {
    // Here you would typically call an API to update grades
    console.log(`Assigned grade ${grade} to student with ID ${studentId}`);
    alert(`Grade ${grade} assigned successfully!`);
}

// Function for teacher communication with parents
function sendMessageToParents(studentId, message) {
    // Simulate sending a message to a student's parents
    console.log(`Message sent to parents of student with ID ${studentId}: ${message}`);
    alert('Message sent to parents!');
}
