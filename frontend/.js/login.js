// Sample login function
const loginForm = document.getElementById('loginForm');
const loginMessage = document.getElementById('loginMessage');

loginForm.addEventListener('submit', function (e) {
    e.preventDefault();

    const username = document.getElementById('username').value;
    const password = document.getElementById('password').value;

    // Simple validation (You can replace this with API authentication)
    if (username === 'admin' && password === 'admin123') {
        window.location.href = 'dashboard.html';  // Redirect to the dashboard page
    } else {
        loginMessage.textContent = 'Invalid username or password!';
        loginMessage.style.color = 'red';
    }
});
