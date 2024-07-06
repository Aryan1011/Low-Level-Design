package lld.designPatterns.prototype.solution;

public class StudentSol implements Prototype{

    int age;
    String name;
    private int rollNumber;

    public StudentSol(int age, String name, int rollNumber) {
        this.age = age;
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public StudentSol() {
    }
    @Override
    public Prototype clone() {
        return new StudentSol(age,name,rollNumber);
    }
}
