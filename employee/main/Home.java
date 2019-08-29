
package employee.main;

import database.Database;
import employee.models.Employee;
import java.awt.Color;
import java.awt.FlowLayout;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class Home extends JFrame{
    
    private JPanel panel;
    private JMenuBar menuBar = new JMenuBar();
    JMenu list = new JMenu("list");
    JMenu add = new JMenu("Add Employee");
    JMenu task = new JMenu("Task");
    
    public Home(String title){
        super(title);
        
        
        try {
            Database d = new Database();
            Employee e = new Employee("john", "cena", "california", "98674567654", 70000, 4);
            d.addEmployee(e);
            } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            
            setVisible(true);
            setLayout(new FlowLayout());
            setExtendedState(JFrame.MAXIMIZED_BOTH);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            setJMenuBar(menuBar);
            menuBar.add(list);
            menuBar.add(add);
            menuBar.add(task);

        
    }
    
   
    
  
}
