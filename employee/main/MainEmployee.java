package employee.main;

import database.Database;
import employee.models.Employee;
import java.sql.SQLException;


public class MainEmployee {
    public static void main(String[] args) throws SQLException {
        //Employee e = new Employee("Rajesh", "Hamal", "KTM", "9860404913", 60000,2);
        Database d = new Database();
        d.deleteEmployee(5);
    }
}
