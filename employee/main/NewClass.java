/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.main;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class NewClass {

    public NewClass(){
        
        // create JFrame and JTable
        JFrame frame = new JFrame();
        JTable table = new JTable(); 
        
        // create a table model and set a Column Identifiers to this model 
        Object[] columns = {"S.N","Firstname","Lasname","Address","Salary","Department"};
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(columns);
        
        // set the model to the table
        table.setModel(model);
        
        // Change A JTable Background Color, Font Size, Font Color, Row Height
        table.setBackground(Color.LIGHT_GRAY);
        table.setForeground(Color.black);
        Font font = new Font("",1,22);
        table.setFont(font);
        table.setRowHeight(30);
        
        // create JTextFields
        JTextField textSN = new JTextField();
        JTextField firstname = new JTextField();
        JTextField lastname = new JTextField();
        JTextField address = new JTextField();
        JTextField contact = new JTextField();
        JTextField salary = new JTextField();
        JTextField department = new JTextField();
        
        // create JButtons
        JButton btnAdd = new JButton("Add");
        JButton btnDelete = new JButton("Delete");
        JButton btnUpdate = new JButton("Update");     
        
        
        
        // create JScrollPane
        JScrollPane pane = new JScrollPane(table);
        pane.setBounds(0, 0, 880, 200);
        
        frame.setLayout(null);
        
        frame.add(pane);
        
        // add JTextFields to the jframe
        frame.add(textSN);
        frame.add(firstname);
        frame.add(lastname);
        frame.add(address);
        frame.add(contact);
        frame.add(address);
        frame.add(address);
    
        // add JButtons to the jframe
        frame.add(btnAdd);
        frame.add(btnDelete);
        frame.add(btnUpdate);
        
        // create an array of objects to set the row data
        Object[] row = new Object[4];
        
        // button add row
        btnAdd.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
             
//                row[0] = textSN.getText();
//                row[1] = textFname.getText();
//                row[2] = textLname.getText();
//                row[3] = textAge.getText();
                
                // add row to the model
                model.addRow(row);
            }
        });
        
        // button remove row
        btnDelete.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
            
                // i = the index of the selected row
                int i = table.getSelectedRow();
                if(i >= 0){
                    // remove a row from jtable
                    model.removeRow(i);
                }
                else{
                    System.out.println("Delete Error");
                }
            }
        });
        
        // get selected row data From table to textfields 
        table.addMouseListener(new MouseAdapter(){
        
        @Override
        public void mouseClicked(MouseEvent e){
            
            // i = the index of the selected row
            int i = table.getSelectedRow();
            
//            textSN.setText(model.getValueAt(i, 0).toString());
//            textFname.setText(model.getValueAt(i, 1).toString());
//            textLname.setText(model.getValueAt(i, 2).toString());
//            textAge.setText(model.getValueAt(i, 3).toString());
        }
        });
        
        // button update row
        btnUpdate.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
             
                // i = the index of the selected row
                int i = table.getSelectedRow();
                
                if(i >= 0) 
                {
//                   model.setValueAt(textSN.getText(), i, 0);
//                   model.setValueAt(textFname.getText(), i, 1);
//                   model.setValueAt(textLname.getText(), i, 2);
//                   model.setValueAt(textAge.getText(), i, 3);
                }
                else{
                    System.out.println("Update Error");
                }
            }
        });
        
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
    }
}
