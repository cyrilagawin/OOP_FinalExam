
package dormmanagementsystem.entities;

public class Admin {
    private int adminId;
    private String username;
    private String password;
    private String role;

    // Empty constructor (Useful when fetching data from the database)
    public Admin() {}

    // Parameterized constructor (Useful when inserting new data)
    public Admin(int adminId, String username, String password, String role) {
        this.adminId = adminId;
        this.username = username;
        this.password = password;
        this.role = role;
    }

    // Getters
    public int getAdminId() { return adminId; }
    public String getUsername() { return username; }
    public String getPassword() { return password; }
    public String getRole() { return role; }

    // Setters
    public void setAdminId(int adminId) { this.adminId = adminId; }
    public void setUsername(String username) { this.username = username; }
    public void setPassword(String password) { this.password = password; }
    public void setRole(String role) { this.role = role; }
}
