# Hambert School Complex Web Application

## Overview
This web application is designed for **Hambert School Complex** located in Tema New Town, Greater Accra Region of Ghana. It includes a comprehensive system for managing students, teachers, parents, and administrators. The project allows users to manage student information, grades, attendance, fees, and facilitate communication between teachers and parents.

## Features
- **User Authentication**: Students, teachers, parents, and admins can log in and access their respective dashboards.
- **Dashboard for Each Role**: Separate dashboards for students, teachers, parents, and admins.
- **Student Information**: Manage student profiles, grades, attendance, and fees.
- **Teacher Management**: Teachers can assign grades and track attendance.
- **Admin Management**: Admins can manage users, fees, attendance, and grades.
- **Responsive Design**: The application is designed to be mobile-friendly and responsive.

## Technologies Used
- **Frontend**: HTML, CSS, JavaScript
- **Backend**: Java (JDBC for database connection)
- **Database**: MySQL
- **Version Control**: GitHub

## Prerequisites
- Java 11 or higher
- MySQL Database
- Git (for version control)

## Setup Instructions

### 1. Clone the Repository
Clone the project repository to your local machine:

```bash
git clone https://github.com/your-username/hambert-school-complex.git
cd hambert-school-complex

Directory Structure and Purpose:
1. frontend/
This directory contains all the files related to the website's frontend, including the HTML, CSS, JavaScript, and images that create a visually engaging and interactive user interface.

frontend/index.html:
The primary entry point of the website, showcasing the landing page with sections like Welcome, About Us, Vision & Mission, Photo Gallery, Login, and Contact. This file ensures a responsive layout using semantic HTML5 and links to other resources (CSS, JS, images) for styling and functionality.

frontend/css/style.css:
The CSS file defines the visual aesthetics of the website, including the breathtaking green color theme, responsive layouts, typography (Google Fonts), and animations for the gallery and navigation. It ensures the sticky sidebar navigation and maintains the uniform appearance of all pages.

frontend/js/script.js:
This JavaScript file handles interactive functionalities, such as the gallery slideshow (smooth image transitions), form validation for the login page, and dynamic navigation highlighting. It enhances the user experience by providing seamless interactivity.

frontend/images/:
Stores all image assets, including the school logo (school-logo.png) and gallery photos. These images are referenced in the HTML and styled using the CSS for visual consistency. Alt attributes ensure accessibility for users with disabilities.

2. backend/
This directory handles the application's logic and data management, ensuring dynamic functionality.

Java Classes and APIs:
The Java backend stores and retrieves data for students, teachers, and parents. It includes user authentication logic for the login page and APIs for fetching student details (attendance, grades, and fees) from a database. For example:
Student and Teacher Classes: Manage data for individual users.
Authentication Service: Verifies login credentials.
Admin Handlers: Provide restricted access to sensitive data.
Purpose of the Code:
The project’s goal is to bridge the communication gap between students, teachers, and parents while showcasing the school's unique identity. The frontend ensures a welcoming and professional presentation of the school, while the backend enables secure and functional data handling. The green color theme reflects growth and education, reinforcing the school’s mission to empower students as global leaders.

Each component contributes to the overall user experience:

Navigation: Easy access to key sections of the website.
Gallery: Visual representation of the school’s facilities and activities.
Login System: Secure access for students, teachers, and parents to their respective dashboards.
Vision & Mission: Inspires visitors and communicates the school’s long-term goals.
Together, these components form a robust, functional, and visually appealing platform for HAMBERT SCHOOL COMPLEX.


link to project presentation: 
https://www.canva.com/design/DAGarEFZfYg/4UlMbPPSwr14e37EpcHuTw/edit?utm_content=DAGarEFZfYg&utm_campaign=designshare&utm_medium=link2&utm_source=sharebutton