CREATE DATABASE scams_db;
USE scams_db;

CREATE TABLE admins (
                        admin_id INT PRIMARY KEY AUTO_INCREMENT,
                        username VARCHAR(50) NOT NULL,
                        password VARCHAR(255) NOT NULL
);

CREATE TABLE students (
                          student_id INT PRIMARY KEY AUTO_INCREMENT,
                          name VARCHAR(100) NOT NULL,
                          username VARCHAR(50) NOT NULL UNIQUE,
                          password VARCHAR(255) NOT NULL,
                          email VARCHAR(100)
);

CREATE TABLE courses (
                         course_id INT PRIMARY KEY AUTO_INCREMENT,
                         title VARCHAR(100) NOT NULL,
                         credit_hours INT NOT NULL
);

CREATE TABLE enrollments (
                             enroll_id INT PRIMARY KEY AUTO_INCREMENT,
                             student_id INT,
                             course_id INT,
                             grade VARCHAR(5),
                             FOREIGN KEY (student_id) REFERENCES students(student_id),
                             FOREIGN KEY (course_id) REFERENCES courses(course_id)
);

-- Insert default admin (username: admin, password: admin)
INSERT INTO admins (username, password) VALUES ('admin', 'YWRtaW4=');



ALTER TABLE courses ADD COLUMN deleted TINYINT(1) DEFAULT 0;



