const loginForm = document.getElementById('loginForm');
const loginMessage = document.getElementById('loginMessage');

loginForm.addEventListener('submit', function (e) {
    e.preventDefault();

    const username = document.getElementById('username').value;
    const password = document.getElementById('password').value;

    // Simple front-end validation (still only for demo purposes)
    if (username === "" || password === "") {
        loginMessage.textContent = 'Username and Password are required!';
        loginMessage.style.color = 'red';
        return;
    }

    // You should replace this with an API call to your server for authentication
    // Example API call:
    /*
    fetch('/api/login', {
        method: 'POST',
        body: JSON.stringify({ username, password }),
        headers: { 'Content-Type': 'application/json' }
    })
    .then(response => response.json())
    .then(data => {
        if (data.success) {
            window.location.href = 'dashboard.html';  // Redirect to the dashboard page
        } else {
            loginMessage.textContent = 'Invalid username or password!';
            loginMessage.style.color = 'red';
        }
    })
    .catch(error => {
        console.error('Error:', error);
        loginMessage.textContent = 'An error occurred during login!';
        loginMessage.style.color = 'red';
    });
    */

    // Simulated backend response for demo purposes
    if (username === 'admin' && password === 'admin123') {
        window.location.href = 'dashboard.html';  // Redirect to the dashboard page
    } else {
        loginMessage.textContent = 'Invalid username or password!';
        loginMessage.style.color = 'red';
    }
});
