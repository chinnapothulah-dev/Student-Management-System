import javax.swing.*;

public class Dashboard extends JFrame {

    public Dashboard() {

        setTitle("Student Management System Dashboard");
        setSize(500,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel title = new JLabel("Student Management System Dashboard");
        title.setBounds(100,20,300,30);

        JButton btnAdd = new JButton("Add Student");
        btnAdd.setBounds(150,80,180,30);

        JButton btnView = new JButton("View Students");
        btnView.setBounds(150,130,180,30);

        JButton btnUpdate = new JButton("Update Student");
        btnUpdate.setBounds(150,180,180,30);

        JButton btnDelete = new JButton("Delete Student");
        btnDelete.setBounds(150,230,180,30);

        JButton btnLogout = new JButton("Logout");
        btnLogout.setBounds(150,280,180,30);

        add(title);
        add(btnAdd);
        add(btnView);
        add(btnUpdate);
        add(btnDelete);
        add(btnLogout);
        
btnAdd.addActionListener(e -> {
    new AddStudentFrame();
});


btnView.addActionListener(e -> {
    new ViewStudentsFrame();
});

btnUpdate.addActionListener(e -> {
    new UpdateStudentFrame();
});

btnDelete.addActionListener(e -> {
    new DeleteStudentFrame();
});

btnLogout.addActionListener(e -> {
    dispose();
});
        setVisible(true);
    }
}
    