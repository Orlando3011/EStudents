package com.company.model.people;

import com.company.model.Grades;
import com.company.model.Group;

import java.util.List;

public class Student extends Person {

    private Group group;
    private List<Grades> studentGrades;

    Student(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public List<Grades> getStudentGrades() {
        return studentGrades;
    }

    public void setStudentGrades(List<Grades> studentGrades) {
        this.studentGrades = studentGrades;
    }
}
