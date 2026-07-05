import java.util.ArrayList;

class StudentManager {

    ArrayList<Student> students = new ArrayList<>();

    void addStudent(Student s) {
        students.add(s);
        System.out.println("Student Added Successfully");
    }

    void viewStudents() {

        if (students.isEmpty()) {
            System.out.println("No Students Found");
            return;
        }

        for (Student s : students) {
            s.display();
        }
    }

    void searchStudent(int id) {

        for (Student s : students) {

            if (s.id == id) {
                s.display();
                return;
            }
        }

        System.out.println("Student Not Found");
    }

    void updateStudent(int id, double newMarks) {

        for (Student s : students) {

            if (s.id == id) {
                s.marks = newMarks;
                System.out.println("Student Updated Successfully");
                return;
            }
        }

        System.out.println("Student Not Found");
    }

    void deleteStudent(int id) {

        for (int i = 0; i < students.size(); i++) {

            if (students.get(i).id == id) {
                students.remove(i);
                System.out.println("Student Deleted Successfully");
                return;
            }
        }

        System.out.println("Student Not Found");
    }
}