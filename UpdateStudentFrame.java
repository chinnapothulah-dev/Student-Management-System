import javax.swing.*;

public class UpdateStudentFrame extends JFrame {

    public UpdateStudentFrame() {

        setTitle("Update Student");
        setSize(350, 250);
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel lblId = new JLabel("Student ID:");
        lblId.setBounds(30, 30, 100, 25);

        JTextField txtId = new JTextField();
        txtId.setBounds(140, 30, 150, 25);

        JLabel lblName = new JLabel("New Name:");
        lblName.setBounds(30, 80, 100, 25);

        JTextField txtName = new JTextField();
        txtName.setBounds(140, 80, 150, 25);

        JButton btnUpdate = new JButton("Update");
        btnUpdate.setBounds(120, 140, 100, 30);

        btnUpdate.addActionListener(e -> {

            String id = txtId.getText();
            String newName = txtName.getText();

            for (Student s : StudentManager.students) {
                if (s.getId().equals(id)) {
                    s.setName(newName);
                    JOptionPane.showMessageDialog(this,
                            "Student Updated Successfully");
                    return;
                }
            }

            JOptionPane.showMessageDialog(this,
                    "Student Not Found");
        });

        add(lblId);
        add(txtId);
        add(lblName);
        add(txtName);
        add(btnUpdate);

        setVisible(true);
    }
}