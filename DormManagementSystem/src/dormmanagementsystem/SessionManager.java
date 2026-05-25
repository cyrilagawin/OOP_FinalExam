
package dormmanagementsystem;

//like a state-tracker that keeps track wether the admin is logged in or not
public class SessionManager {
    private static boolean isLoggedIn = false;
    private static String currentAdminUsername = null;
    
    //method to login the user to the dashboard
    public static void startSession(String username) {
        isLoggedIn = true;
        currentAdminUsername = username;
    }
    
    //method to logout the user from the dashboard
    public static void endSession() {
        isLoggedIn = false;
        currentAdminUsername = null;
    }
    
    //method if there is an admin user logged in
    public static boolean isLoggedIn() {
        return isLoggedIn;
    }
    
    //Optional: display the current username
    public static String getCurrentAdminUsername() {
        return currentAdminUsername;
    }
}
