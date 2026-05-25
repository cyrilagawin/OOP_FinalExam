
package dormmanagementsystem.entities;

public class Complaint {
    private int complaintId;
    private int studentId; // Foreign Key to Student
    private int roomNumber; // Foreign Key to Room
    private String issueType; // e.g., "Plumbing", "Electrical"
    private String description;
    private String status; // "Open", "Resolved"

    public Complaint() {}

    public Complaint(int complaintId, int studentId, int roomNumber, String issueType, String description, String status) {
        this.complaintId = complaintId;
        this.studentId = studentId;
        this.roomNumber = roomNumber;
        this.issueType = issueType;
        this.description = description;
        this.status = status;
    }

    // Getters
    public int getComplaintId() { return complaintId; }
    public int getStudentId() { return studentId; }
    public int getRoomNumber() { return roomNumber; }
    public String getIssueType() { return issueType; }
    public String getDescription() { return description; }
    public String getStatus() { return status; }

    // Setters
    public void setComplaintId(int complaintId) { this.complaintId = complaintId; }
    public void setStudentId(int studentId) { this.studentId = studentId; }
    public void setRoomNumber(int roomNumber) { this.roomNumber = roomNumber; }
    public void setIssueType(String issueType) { this.issueType = issueType; }
    public void setDescription(String description) { this.description = description; }
    public void setStatus(String status) { this.status = status; }
}
