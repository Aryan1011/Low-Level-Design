package lld.designPatterns.prototype;

import lld.designPatterns.prototype.solution.StudentSol;

public class Main {
    public static void main(String[] args) {
        Student student = new Student(5,"Aryan",21);
        // problems - You have to the logic to clone (All fields)
        // and what if some member is private (getter also )
        Student cloneStudent = new Student();
        cloneStudent.name = student.name;
        cloneStudent.age = student.age;
//        cloneStudent.rollNumber = student.rollNumber;

        // solution clone() method should be implemented by class student
        // interface implemented (so that this clone method is consistently named)

        StudentSol studentSol= new StudentSol(5,"Abc",22);
        StudentSol clone = (StudentSol) studentSol.clone();

    }
}
