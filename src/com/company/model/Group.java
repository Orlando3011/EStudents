package com.company.model;

import com.company.model.people.Student;
import com.company.model.people.Teacher;

import java.util.List;

public class Group {
    private String name;
    private List<Student> students;
    private Teacher supervisor;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Teacher getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Teacher supervisor) {
        this.supervisor = supervisor;
    }
}
