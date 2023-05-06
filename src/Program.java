import java.util.ArrayList;
import java.util.List;

import entities.School;
import entities.Student;
import entities.Teacher;

public class Program {
    public static void main(String[] args) {
        

        Teacher teacher = new Teacher(1, "Joel", 2000);
        Teacher teacher1 = new Teacher(2, "Melissa ", 3000);
        Teacher teacher2 = new Teacher(3, "Juan ", 4000);

        List <Teacher> teachers = new ArrayList<>();

        teachers.add(teacher);
        teachers.add(teacher1);
        teachers.add(teacher2);

        Student student = new Student(1,"Maria" , 3);
        Student student1 = new Student(2,"Jose" , 2);
        Student student2 = new Student(3,"Luis" , 1);
        Student student3 = new Student(4,"Juan" , 3);

        List<Student> students = new ArrayList<>();

        students.add(student);
        
        students.add(student1); 
        students.add(student2);
        
        students.add(student3);

      

        School cSchool = new School(teachers, students);

        student.pay(5000);
        student2.pay(4000);

        System.out.println(teacher.getSalary()); 
        System.out.println(cSchool.getTotalMoneyEarned());
    }
}
