package entities;

import java.util.ArrayList;
import java.util.List;

public class School {
    
    private static List<Teacher> teacher ;
    private static List<Student> student;

    private static int totalMoneyEarned;
    private static int totalMoneySpent;

    public School() {

    }

    public School(List<Teacher> teacher, List<Student> student) {
        this.teacher = teacher;
        this.student = student;
        totalMoneyEarned = 0;
       totalMoneySpent = 0;
    }

    public List<Teacher> getTeacher() {
        return teacher;
    }

    public List<Student> getStudent() {
        return student;
    }

    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    public void addTeacher(Teacher  teacher) {
       this.teacher.add(teacher);
    }
    public void addStudent(Student student) {
       this.student.add(student);
    }

   public static void updateTotalMoneyEarned(int MoneyEarned) {
    totalMoneyEarned += MoneyEarned;
   }

   public void updateTotalMoneySpent(int MoneySpent) {
    totalMoneySpent -= MoneySpent;
   }
    public void setTotalMoneyEarned(int totalMoneyEarned) {
        this.totalMoneyEarned = totalMoneyEarned;
    }

    public void setTotalMoneySpent(int totalMoneySpent) {
        this.totalMoneySpent = totalMoneySpent;
    }



    

    
    
}
