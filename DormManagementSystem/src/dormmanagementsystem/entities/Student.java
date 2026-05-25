
package dormmanagementsystem.entities;

public class Student {
    private int studentId;
    private String firstName;
    private String lastName;
    private int roomNumber;

    public Student() {}

    public Student(int studentId, String firstName, String lastName, int roomNumber) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.roomNumber = roomNumber;
    }

    // Getters
    public int getStudentId() { return studentId; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public int getRoomNumber() { return roomNumber; }

    // Setters
    public void setStudentId(int studentId) { this.studentId = studentId; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public void setRoomNumber(int roomNumber) { this.roomNumber = roomNumber; }
    
    @Override
    //Used in the Complaint and Fee Management Frame to display the full name of the student
    public String toString() {
        return firstName + " " + lastName; 
    }
}
