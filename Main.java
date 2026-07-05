 import java.util.Scanner;
 public class Main {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        StudentManager manager = new StudentManager();

        manager.addStudent(new Student(101, "Harika", 95));
        manager.addStudent(new Student(102, "Anu", 88));

        System.out.println("All Students:");
        manager.viewStudents();

        System.out.println("\nSearch Student:");
        manager.searchStudent(101);

        System.out.println("\nUpdate Student:");
        manager.updateStudent(101, 99);

        System.out.println("\nStudents After Update:");
        manager.viewStudents();

        System.out.println("\nDelete Student:");
        manager.deleteStudent(102);

        System.out.println("\nStudents After Delete:");
        manager.viewStudents();
    }
}