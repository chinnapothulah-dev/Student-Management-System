
 import javax.swing.*;

public class LoginFrame extends JFrame {

    JTextField txtUsername;
    JPasswordField txtPassword;
    JButton btnLogin;

    public LoginFrame() {

        setTitle("Student Management System");
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel title = new JLabel("Student Management System");
        title.setBounds(90,20,250,30);

        JLabel lblUsername = new JLabel("Username:");
        lblUsername.setBounds(50,80,80,25);

        txtUsername = new JTextField();
        txtUsername.setBounds(140,80,180,25);

        JLabel lblPassword = new JLabel("Password:");
        lblPassword.setBounds(50,120,80,25);

        txtPassword = new JPasswordField();
        txtPassword.setBounds(140,120,180,25);

        btnLogin = new JButton("Login");
        btnLogin.setBounds(140,180,100,30);

        btnLogin.addActionListener(e -> {

            String username = txtUsername.getText();
            String password = new String(txtPassword.getPassword());

            if (username.equals("admin") && password.equals("admin123")) {

    JOptionPane.showMessageDialog(this, "Login Successful");

    Dashboard dashboard = new Dashboard();
    dashboard.setVisible(true);

    dispose();

} else {

    JOptionPane.showMessageDialog(this, "Invalid Username or Password");
}

        });

        add(title);
        add(lblUsername);
        add(txtUsername);
        add(lblPassword);
        add(txtPassword);
        add(btnLogin);

        setVisible(true);
    }

    public static void main(String[] args) {
        new LoginFrame();
    }
}   
