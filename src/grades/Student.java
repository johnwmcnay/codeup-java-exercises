package grades;

import java.util.ArrayList;

public class Student {

    private String name;
    private ArrayList<Integer> grades = new ArrayList<>();

    public static void main(String[] args) {
        Student student1 = new Student("John");
        System.out.println("student1.getName() = " + student1.getName());

        System.out.println("Adding 77, 85, and 98");
        student1.addGrades(77, 85, 98);

        System.out.println("student1.toString() = " + student1.getGrades().toString());
        System.out.println("student1.getGradeAverage() = " + student1.getGradeAverage());
    }

    public Student(String name) {
        setName(name);
    }

    public Student(String name, int ...grades) {
        setName(name);
        addGrades(grades);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Integer> getGrades() {
        return this.grades;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade) {
        this.grades.add(grade);
    }

    public void addGrades(int ...grades) {
        for (int grade: grades) {
            this.addGrade(grade);
        }
    }
    // returns the average of the students grades
    public double getGradeAverage() {
        double sum = 0;

        for (int grade: this.grades) {
            sum += grade;
        }
        return sum / this.grades.size();
    }
}
