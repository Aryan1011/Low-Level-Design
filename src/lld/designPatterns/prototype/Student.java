package lld.designPatterns.prototype;

public class Student {
    int age;
    String name;
    private int rollNumber;

    public Student(int age, String name, int rollNumber) {
        this.age = age;
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public Student() {
    }
}
