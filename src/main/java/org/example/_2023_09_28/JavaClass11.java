package org.example._2023_09_28;

public class JavaClass11 {
    private Student student;

    public JavaClass11(Student student) {
        this.student = student;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}

class Student {
    private String name;
    private int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }
}

class Main3 {
    public static void main(String[] args) {
        Student s1 = new Student("Nik", 2);
        JavaClass11 class1  = new JavaClass11(s1);

        Student ex1 = class1.getStudent();
        int c = ex1.getCourse();
        System.out.println(c);

        //----------------------------------------
        class1.getStudent().getCourse();

    }
}
