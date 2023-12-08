package org.launchcode;

import java.util.ArrayList;
import java.util.Objects;

public class Course {
    private String topic;
    private Teacher instructor;
    private ArrayList<Student> enrolledStudents;

    public String toString(){
        return String.format("Class: %s. This is being taught by: %s. The students enrolled are: %s",
                this.topic, this.instructor, this.enrolledStudents);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Course course)) return false;
        return Objects.equals(topic, course.topic) && Objects.equals(instructor, course.instructor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(topic, instructor);
    }

}
