package employee.main;

import database.Database;
import java.sql.SQLException;
import javax.swing.*;   

public class MainEmployee {

    public static void main(String[] args) {
        
        Dashboard frame = new Dashboard();
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setTitle("Employee Management System");
        
//        try {
//            if (login()) {
//                new Dashboard("Employee management system");
//            } else {
//                JOptionPane.showMessageDialog(null, "Username or password not valid","Error",JOptionPane.ERROR_MESSAGE);
//            }
//        } catch (SQLException ex) {
//            System.out.println(ex.getMessage());
//        }
    }
    

    

    public static boolean login() throws SQLException {
        Database d = new Database();
        JTextField username = new JTextField();
        JTextField password = new JPasswordField();
        Object[] message = {
            "Username:", username,
            "Password:", password
        };

        int option = JOptionPane.showConfirmDialog(null, message, "Login", JOptionPane.OK_CANCEL_OPTION);
        if (option == JOptionPane.OK_OPTION) {

            if (d.auth(username.getText(), password.getText())) {
                return true;
            }

            return false;
        } else {
            return false;
        }
    }
}
