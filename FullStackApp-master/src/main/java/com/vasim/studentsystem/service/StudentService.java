package com.vasim.studentsystem.service;

import java.util.List;

import com.vasim.studentsystem.model.Student;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
}
