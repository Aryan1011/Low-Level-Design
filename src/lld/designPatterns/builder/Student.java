package lld.designPatterns.builder;

import java.util.List;

public class Student {
    // mandatory
    private int rollNumber;
    // non Mandatory
    private int age;
    private String name;
    private String fatherName;
    private String motherName;
    private List<String> subjects;
    // cant possibly have all the constructors because signature will interferer
    // rollNumber,name has same signature as rollNumber, fatherName
//    public Student(int age, String fatherName, String motherName, String name, int rollNumber, List<String> subjects) {
//        this.age = age;
//        this.fatherName = fatherName;
//        this.motherName = motherName;
//        this.name = name;
//        this.rollNumber = rollNumber;
//        this.subjects = subjects;
//    }

    public Student(StudentBuilder builder) {
        this.age = builder.age;
        this.fatherName = builder.fatherName;
        this.motherName = builder.motherName;
        this.name = builder.name;
        this.rollNumber = builder.rollNumber;
        this.subjects = builder.subjects;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", rollNumber=" + rollNumber +
                ", name='" + name + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", motherName='" + motherName + '\'' +
                ", subjects=" + subjects +
                '}';
    }
}
