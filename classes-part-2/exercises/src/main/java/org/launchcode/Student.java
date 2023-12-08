package org.launchcode;

import java.util.Objects;

public class Student {

    private static int nextStudentId = 1;
    private String name;



    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public Student (String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);
    }

    public Student(String name) {
        this(name, nextStudentId);
        nextStudentId++;
    }

    public String studentInfo() {
        return (this.name + " has a GPA of: " + this.gpa);
    }



    public String getGradeLevel() {
        if (this.numberOfCredits < 30){
            return "Freshman";
        } else if (this.numberOfCredits < 60){
            return "Sophomore";
        } else if (this.numberOfCredits < 90){
            return "Junior";
        } else {
            return "Senior";
        }
    }

    // TODO: Complete the addGrade method.
    public void addGrade(int courseCredits, double grade) {
        double currentGpa = this.gpa * this.numberOfCredits;
        currentGpa += courseCredits * grade;
        this.numberOfCredits += courseCredits;
        this.gpa = currentGpa/this.numberOfCredits;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        return getStudentId() == student.getStudentId() && getNumberOfCredits() == student.getNumberOfCredits() && Double.compare(getGpa(), student.getGpa()) == 0 && Objects.equals(getName(), student.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getStudentId(), getNumberOfCredits(), getGpa());
    }

    public String toString(){
        return String.format("%s is currently a %s. They have %s credits and a GPA of %s", this.name,
              this.getGradeLevel(), this.numberOfCredits, this.getGpa());
    };



    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public double getGpa() {
        return gpa;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    private void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

    public static void main(String[] args) {
        Student sally = new Student("Sally",1,1,4.0);
        System.out.println("The Student class works! " + sally.getName() + " is a student!");
        System.out.println(sally);
        sally.addGrade(12, 3.5);
        System.out.println(sally);
        sally.addGrade(25, 3.8);
        System.out.println(sally);
    }
}