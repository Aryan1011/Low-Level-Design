package lld.designPatterns.builder;

public class Main {
    public static void main(String[] args) {
        StudentBuilder studentBuilder = new EngineerStudentBuilder();
        Director director = new Director(studentBuilder);
        Student student = director.createStudent();
        System.out.println(student);
        // decorator and builder are confused
        // remeber pizza example
        // builder cant handle dynamic requests
    }
}
