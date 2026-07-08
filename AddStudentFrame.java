
    import javax.swing.*;

public class AddStudentFrame extends JFrame {

    public AddStudentFrame() {

        setTitle("Add Student");
        setSize(400, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblId = new JLabel("Student ID:");
        lblId.setBounds(30, 30, 100, 25);

        JTextField txtId = new JTextField();
        txtId.setBounds(150, 30, 150, 25);

        JLabel lblName = new JLabel("Name:");
        lblName.setBounds(30, 70, 100, 25);

        JTextField txtName = new JTextField();
        txtName.setBounds(150, 70, 150, 25);

        JButton btnSave = new JButton("Save");
        btnSave.setBounds(120, 150, 100, 30);
btnSave.addActionListener(e -> {
    String id = txtId.getText();
    String name = txtName.getText();
    Student student = new Student(id, name);
    StudentManager.addStudent(student);
StudentManager.addStudent(student);

System.out.println("Total Students = " +
        StudentManager.students.size());

    JOptionPane.showMessageDialog(this, "Student Saved Successfully");
});


        add(lblId);
        add(txtId);
        add(lblName);
        add(txtName);
        add(btnSave);

        setVisible(true);
    }
}

