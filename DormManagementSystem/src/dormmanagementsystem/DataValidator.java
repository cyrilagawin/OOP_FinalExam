
package dormmanagementsystem;

import javax.swing.JOptionPane;

public class DataValidator {
    public static boolean isNotEmpty(String... fields) {
        for (String field : fields) {
            if (field == null || field.trim().isEmpty()) {
                return false;
            }
        }
        return true;
    }

    public static boolean isInteger(String text) {
        try {
            Integer.valueOf(text.trim());
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    
    public static void showError(java.awt.Component parent, String message) {
        JOptionPane.showMessageDialog(parent, message, "Validation Error", JOptionPane.ERROR_MESSAGE);
    }
}