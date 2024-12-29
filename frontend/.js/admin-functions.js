// Function to add a new user (student, teacher, parent)
function addUser(userType, userInfo) {
    // Simulate adding a user (In a real scenario, this would involve an API request)
    console.log(`Added a new ${userType}:`, userInfo);
    alert(`${userType} added successfully!`);
}

// Function to remove a user
function removeUser(userId) {
    // Simulate removing a user
    console.log(`Removed user with ID: ${userId}`);
    alert('User removed successfully!');
}

// Function to manage student fees
function manageFees(studentId, feeAmount) {
    // Simulate fee management
    console.log(`Fee of $${feeAmount} has been set for student with ID ${studentId}`);
    alert(`Fee of $${feeAmount} applied to student ${studentId}`);
}
