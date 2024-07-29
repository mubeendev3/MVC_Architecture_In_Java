
package mvc_architecture;

import java.util.Scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentView view = new StudentView();
        StudentController controller = new StudentController(view);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Student Management System");
            System.out.println("1. Add Student");
            System.out.println("2. Update Student");
            System.out.println("3. Display All Students");
            System.out.println("4. Display Student by Roll Number");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Roll Number: ");
                    String rollNumber = scanner.nextLine();
                    controller.addStudent(name, age, rollNumber);
                    break;
                case 2:
                    System.out.print("Enter Roll Number of the student to update: ");
                    String updateRollNumber = scanner.nextLine();
                    System.out.print("Enter new name: ");
                    String newName = scanner.nextLine();
                    System.out.print("Enter new age: ");
                    int newAge = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    controller.updateStudent(updateRollNumber, newName, newAge);
                    break;
                case 3:
                    controller.displayStudents();
                    break;
                case 4:
                    System.out.print("Enter Roll Number: ");
                    String displayRollNumber = scanner.nextLine();
                    controller.displayStudent(displayRollNumber);
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
