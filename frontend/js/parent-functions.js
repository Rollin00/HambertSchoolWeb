document.addEventListener('DOMContentLoaded', () => {
    const parentName = 'John Doe';  // This would be fetched dynamically (e.g., from session or API)
    const childName = 'Emily Doe';
    const grade = 'Grade 5';
    const gpa = 3.8;
    const attendanceRate = '95%';
    const absencesCount = 3;
    const outstandingFee = '$200';

    // Personalize dashboard sections
    document.querySelector('#dashboard-welcome h2').textContent = `Welcome, ${parentName}!`;
    document.querySelector('#child-performance .performance-summary').innerHTML = `
        <p><strong>Child's Name:</strong> ${childName}</p>
        <p><strong>Grade Level:</strong> ${grade}</p>
        <p><strong>Current GPA:</strong> ${gpa}</p>
        <p><strong>Attendance Rate:</strong> ${attendanceRate}</p>
    `;
    document.querySelector('#attendance-fees .attendance-fees-summary').innerHTML = `
        <p><strong>Number of Absences:</strong> ${absencesCount}</p>
        <p><strong>Outstanding Fees:</strong> ${outstandingFee}</p>
    `;
});
