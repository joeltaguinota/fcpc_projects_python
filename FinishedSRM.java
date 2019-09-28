
package studentrecordmanagement;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;



public class StudentRecordManagement {

    
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Student Record");
        JLabel label = new JLabel("First Name: ");
        JTextField txtField = new JTextField();
        JLabel label2 = new JLabel("Last Name: ");
        JTextField txtField2 = new JTextField();
        JLabel label3 = new JLabel("Age: ");
        JTextField txtField3 = new JTextField();
        JLabel label4 = new JLabel ("Contact Number: ");
        JTextField txtField4 = new JTextField();
        JLabel label5 = new JLabel("Gender: ");
        JCheckBox cBox = new JCheckBox("Male");
        JCheckBox cBox2 = new JCheckBox("Female");
        JTable tblList = new JTable();
        JScrollPane scPane = new JScrollPane(tblList);
        JButton btn = new JButton("Save");
        JButton btn2 = new JButton("Delete");
        
        tblList.setModel(new DefaultTableModel(
                
                new String[][]{},
                new String[]{
                    "First Name",
                    "Last Name",
                    "Age",
                    "Contact Number",
                    "Gender",
                }));
        
        tblList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        
        btn.addActionListener(new ActionListener(){
            @Override
            
            
            public void actionPerformed(ActionEvent ae){
                String FName,LName,gender;
                int Age,ContNum;
                if(txtField.getText().length() == 0 || txtField2.getText().length() == 0 || txtField3.getText().length() == 0 || txtField4.getText().length() == 0){
                    JOptionPane.showMessageDialog(null,"Please complete the form","Empty Field", JOptionPane.WARNING_MESSAGE);
                } else{
                    FName = txtField.getText();
                    LName = txtField2.getText();
                    Age = Integer.parseInt(txtField3.getText());
                    ContNum = Integer.parseInt(txtField4.getText());
                    if(cBox.isSelected()){
                        gender = cBox.getText();
                    }else{
                        gender = cBox2.getText();
                    }
                    String row[] = {FName,LName,Age+"",ContNum+"",gender};
                    DefaultTableModel model = (DefaultTableModel)tblList.getModel();
                    model.addRow(row);
                    
                }
                
            }
                });
        
        
       
        
        btn2.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent ae){
            int selectedRow = tblList.getSelectedRow();
            DefaultTableModel model = (DefaultTableModel) tblList.getModel();
            if (selectedRow < 0){
                JOptionPane.showMessageDialog(null, "Please select a row to delete!", "No row selected", JOptionPane.ERROR_MESSAGE);
            } else{
                model.removeRow(selectedRow);
            }
            
        }
                });
        
        
        label.setBounds(10,20,250,25);
        txtField.setBounds(80,20,200,25);
        label2.setBounds(10,50,250,25);
        txtField2.setBounds(80,50,200,25);
        label3.setBounds(10,80,250,25);
        txtField3.setBounds(40,80,30,25);
        label4.setBounds(10,105,250,25);
        label5.setBounds(10,130,200,25);
        txtField4.setBounds(110,105,170,25);
        cBox.setBounds(5,150,200,25);
        cBox2.setBounds(5,170,200,25);
        btn.setBounds(340,130,250,25);
        btn2.setBounds(340,160,250,25);
        scPane.setBounds(5,200,585,240);
        
        
        
        
        frame.add(label);
        frame.add(txtField);
        frame.add(label2);
        frame.add(txtField2);
        frame.add(label3);
        frame.add(txtField3);
        frame.add(label4);
        frame.add(label5);
        frame.add(txtField4);
        frame.add(cBox);
        frame.add(cBox2);
        frame.add(btn);
        frame.add(btn2);
        frame.add(scPane);
        
        
        
        frame.setSize(600,500);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}
