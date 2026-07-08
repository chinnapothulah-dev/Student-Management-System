import javax.swing.*;

public class DeleteStudentFrame extends JFrame {

    public DeleteStudentFrame() {

        setTitle("Delete Student");
        setSize(350, 200);
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel lblId = new JLabel("Student ID:");
        lblId.setBounds(30, 30, 100, 25);

        JTextField txtId = new JTextField();
        txtId.setBounds(140, 30, 150, 25);

        JButton btnDelete = new JButton("Delete");
        btnDelete.setBounds(120, 90, 100, 30);

        btnDelete.addActionListener(e -> {

            String id = txtId.getText();

            for (int i = 0; i < StudentManager.students.size(); i++) {

                if (StudentManager.students.get(i).getId().equals(id)) {

                    StudentManager.students.remove(i);

                    JOptionPane.showMessageDialog(this,
                            "Student Deleted Successfully");
                    return;
                }
            }

            JOptionPane.showMessageDialog(this,
                    "Student Not Found");
        });

        add(lblId);
        add(txtId);
        add(btnDelete);

        setVisible(true);
    }
}