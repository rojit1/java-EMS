
package database;

import com.mysql.jdbc.*;
import employee.models.Employee;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Database {
        String url = "jdbc:mysql://localhost/ems";
	String username = "root";
	String password = "";
	String sql = "";
	Statement stmt;
	ResultSet rs;
	Connection con;
            
        public Database(){
            try {
                con = (Connection) DriverManager.getConnection(url,username,password);
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        }
        
        public void addEmployee(Employee e) throws SQLException{
            sql = "INSERT INTO employee VALUES("+null+",'"+e.getFirstName()+"','"+e.getLastName()+"','"+e.getAddress()+"','"+e.getContact()+"','"+e.getSalary()+"','"+e.getDept_id()+"')";
            stmt = (Statement) con.createStatement();
            stmt.executeUpdate(sql);
            stmt.close();
            
        }
        
        public List<Employee> getAllEmployee() throws SQLException{
            Employee e;
            List<Employee> list = new ArrayList<>();
            sql = "SELECT * FROM employee";
            stmt = (Statement) con.createStatement();
            rs = stmt.executeQuery(sql);
            while(rs.next()){
                int id = rs.getInt(1);
                String firstName = rs.getString(2);
                String lastName = rs.getString(3);
                String address = rs.getString(4);
                String contact = rs.getString(5);
                int salary = rs.getInt(6);
                int dept_id = rs.getInt(7);
                e = new Employee(firstName,lastName,address,contact,salary,dept_id);
                list.add(e);
            }
            rs.close();;
            stmt.close();
            return list;
        }
        
        public void deleteEmployee(int id) throws SQLException{
            sql = "DELETE from employee where id ="+id;
            stmt = (Statement) con.createStatement();
            stmt.executeUpdate(sql);
            stmt.close();
        }
}
