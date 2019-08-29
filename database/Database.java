package database;

//import com.mysql.jdbc.*;
import employee.models.Employee;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Database {

    String url = "jdbc:mysql://localhost/ems";
    String username = "root";
    String password = "";
    String sql = "";
    ResultSet rs;
    Connection con;

    public Database() {
        try {
            con = (Connection) DriverManager.getConnection(url, username, password);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    //   Admin auth
    public boolean auth(String username, String password) throws SQLException {

        sql = "SELECT * FROM superuser WHERE username=? AND password=?";
        java.sql.PreparedStatement pstm = con.prepareStatement(sql);
        pstm.setString(1, username);
        pstm.setString(2, password);
        rs = pstm.executeQuery();

        if (rs.next()) {
            return true;
        }
        return false;
    }

    // Employee crud
    public void addEmployee(Employee e) throws SQLException {
        sql = "INSERT INTO employee(firstName,lastName,address,contact,salary,dept_id) VALUES(?,?,?,?,?,?)";
        PreparedStatement p = con.prepareStatement(sql);
        p.setString(1, e.getFirstName());
        p.setString(2, e.getLastName());
        p.setString(3, e.getAddress());
        p.setString(4, e.getContact());
        p.setInt(5, e.getSalary());
        p.setInt(6, e.getDept_id());
        p.executeUpdate();
        p.close();

    }

    public List<Employee> getAllEmployee() throws SQLException {
        Employee e;
        List<Employee> list = new ArrayList<>();
        sql = "SELECT * FROM employee";
//        stmt = (Statement) con.createStatement();
//        rs = stmt.executeQuery(sql);
        while (rs.next()) {
            int id = rs.getInt(1);
            String firstName = rs.getString(2);
            String lastName = rs.getString(3);
            String address = rs.getString(4);
            String contact = rs.getString(5);
            int salary = rs.getInt(6);
            int dept_id = rs.getInt(7);
            e = new Employee(firstName, lastName, address, contact, salary, dept_id);
            list.add(e);
        }
        rs.close();;
        //stmt.close();
        return list;
    }

    public void deleteEmployee(int id) throws SQLException {
        sql = "DELETE from employee where id =" + id;
//        stmt = (Statement) con.createStatement();
//        stmt.executeUpdate(sql);
//        stmt.close();
    }
}
