// Smooth scrolling for anchor links
document.querySelectorAll('a[href^="#"]').forEach(anchor => {
    anchor.addEventListener('click', function (e) {
        e.preventDefault();
        
        const target = document.querySelector(this.getAttribute('href'));
        
        // Check if the target element exists before scrolling
        if (target) {
            target.scrollIntoView({
                behavior: 'smooth'
            });
        }
    });
});

// Simple navigation toggle for mobile (optional)
const navToggle = document.querySelector('#nav-toggle');
const navMenu = document.querySelector('#nav-menu');

if (navToggle && navMenu) {
    navToggle.addEventListener('click', () => {
        navMenu.classList.toggle('active');
    });
} else {
    console.error("Navigation elements not found: Ensure #nav-toggle and #nav-menu exist in your HTML.");
}
