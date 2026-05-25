CREATE DATABASE IF NOT EXISTS dorm_management;
USE dorm_management;

CREATE TABLE admin (
    admin_id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL,
    role VARCHAR(50) DEFAULT 'Manager'
);
INSERT INTO admin (username, password) VALUES ('admin', 'admin123');

CREATE TABLE rooms (
    room_number INT PRIMARY KEY,
    capacity INT NOT NULL,
    occupied INT DEFAULT 0,
    status VARCHAR(20) DEFAULT 'Available'
);
INSERT INTO rooms (room_number, capacity, status) VALUES (101, 2, 'Available'), (102, 4, 'Available');

CREATE TABLE students (
    student_id INT AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    room_number INT,
    FOREIGN KEY (room_number) REFERENCES rooms(room_number) ON DELETE SET NULL
);

CREATE TABLE fees (
    fee_id INT AUTO_INCREMENT PRIMARY KEY,
    student_id INT,
    amount DECIMAL(10, 2) NOT NULL,
    fee_month VARCHAR(20),
    status VARCHAR(20) DEFAULT 'Pending',
    FOREIGN KEY (student_id) REFERENCES students(student_id) ON DELETE CASCADE
);

CREATE TABLE complaints (
    complaint_id INT AUTO_INCREMENT PRIMARY KEY,
    student_id INT,
    room_number INT,
    issue_type VARCHAR(50),
    description TEXT,
    status VARCHAR(20) DEFAULT 'Open',
    FOREIGN KEY (student_id) REFERENCES students(student_id) ON DELETE CASCADE,
    FOREIGN KEY (room_number) REFERENCES rooms(room_number) ON DELETE CASCADE
);admin