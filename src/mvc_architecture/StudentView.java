/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mvc_architecture;
import java.util.List;

public class StudentView {
    public void printStudentDetails(String name, int age, String rollNumber) {
        System.out.println("Student Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll Number: " + rollNumber);
    }

    public void printStudentList(List<Student> students) {
        for (Student student : students) {
            printStudentDetails(student.getName(), student.getAge(), student.getRollNumber());
            System.out.println();
        }
    }
}
