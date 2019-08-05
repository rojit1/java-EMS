/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.models;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private String address;
    private String contact;
    private int salary;
    private int dept_id;

    public Employee() {
        this.id = 0;
        this.firstName = null;
        this.lastName = null;
        this.address = null;
        this.contact = null;
        this.salary = 0;
        this.dept_id = 0;
    }
    
    
    

    public Employee(int id, String firstName, String lastName, String address, String contact, int salary, int dept_id) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.contact = contact;
        this.salary = salary;
        this.dept_id = dept_id;
    }
    
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getDept_id() {
        return dept_id;
    }

    public void setDept_id(int dept_id) {
        this.dept_id = dept_id;
    }
    
    @Override
    public String toString(){
        return "[fullname :"+this.firstName+" "+this.lastName+"]\n [Address :"+this.address+"]\n [contact :"+this.contact+"] ]";
    }
    
}