import javax.swing.*;

public class ViewStudentsFrame extends JFrame {

    public ViewStudentsFrame() {

        setTitle("View Students");
        setSize(400, 300);
        setLocationRelativeTo(null);

        JTextArea area = new JTextArea();
        
for (Student s : StudentManager.students) {
    area.append("ID: " + s.getId()
            + "   Name: " + s.getName()
            + "\n");
}
        add(new JScrollPane(area));

        setVisible(true);
    }
}