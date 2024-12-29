// Simulate fetching student grades and updating the page
function updateStudentGrades() {
    const grades = {
        "Mathematics": "A",
        "English": "B+",
        "Science": "A-",
    };

    const gradesTable = document.getElementById('grades-table');
    
    // Loop through grades and create table rows dynamically
    for (let subject in grades) {
        const row = document.createElement('tr');
        const subjectCell = document.createElement('td');
        const gradeCell = document.createElement('td');
        
        subjectCell.textContent = subject;
        gradeCell.textContent = grades[subject];
        
        row.appendChild(subjectCell);
        row.appendChild(gradeCell);
        
        gradesTable.appendChild(row);
    }
}

// Simulate fetching attendance data
function updateAttendance() {
    const attendedDays = 150;
    const totalDays = 180;
    const attendanceRate = ((attendedDays / totalDays) * 100).toFixed(2);

    document.getElementById('attendance-days').textContent = attendedDays;
    document.getElementById('attendance-rate').textContent = `${attendanceRate}%`;
}

// Call functions to populate data on page load
document.addEventListener('DOMContentLoaded', function () {
    updateStudentGrades();
    updateAttendance();
});
