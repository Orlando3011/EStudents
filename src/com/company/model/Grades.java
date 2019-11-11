package com.company.model;

import java.util.List;

public class Grades {
    private Subject subject;
    private List<Integer> studentGrades;

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public List<Integer> getStudentGrades() {
        return studentGrades;
    }

    public void setStudentGrades(List<Integer> studentGrades) {
        this.studentGrades = studentGrades;
    }
}
