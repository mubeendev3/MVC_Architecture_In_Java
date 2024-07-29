/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mvc_architecture;

import java.util.ArrayList;
import java.util.List;

public class StudentController {
    private List<Student> students;
    private StudentView view;

    public StudentController(StudentView view) {
        this.students = new ArrayList<>();
        this.view = view;
    }

    public void addStudent(String name, int age, String rollNumber) {
        Student student = new Student(name, age, rollNumber);
        students.add(student);
    }

    public void updateStudent(String rollNumber, String newName, int newAge) {
        for (Student student : students) {
            if (student.getRollNumber().equals(rollNumber)) {
                student.setName(newName);
                student.setAge(newAge);
                return;
            }
        }
    }

    public void displayStudents() {
        view.printStudentList(students);
    }

    public void displayStudent(String rollNumber) {
        for (Student student : students) {
            if (student.getRollNumber().equals(rollNumber)) {
                view.printStudentDetails(student.getName(), student.getAge(), student.getRollNumber());
                return;
            }
        }
        System.out.println("Student not found!");
    }
}
