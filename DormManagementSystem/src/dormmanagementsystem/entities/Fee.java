package dormmanagementsystem.entities;

public class Fee {
    private int feeId;
    private int studentId; // Foreign Key to Student
    private double amount;
    private String feeMonth;
    private String status; // "Pending", "Paid", "Overdue"

    public Fee() {}

    public Fee(int feeId, int studentId, double amount, String feeMonth, String status) {
        this.feeId = feeId;
        this.studentId = studentId;
        this.amount = amount;
        this.feeMonth = feeMonth;
        this.status = status;
    }

    // Getters
    public int getFeeId() { return feeId; }
    public int getStudentId() { return studentId; }
    public double getAmount() { return amount; }
    public String getFeeMonth() { return feeMonth; }
    public String getStatus() { return status; }

    // Setters
    public void setFeeId(int feeId) { this.feeId = feeId; }
    public void setStudentId(int studentId) { this.studentId = studentId; }
    public void setAmount(double amount) { this.amount = amount; }
    public void setFeeMonth(String feeMonth) { this.feeMonth = feeMonth; }
    public void setStatus(String status) { this.status = status; }
}
