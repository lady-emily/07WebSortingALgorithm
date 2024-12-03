package org.example.services;

import org.example.models.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    private final List<Student> students = new ArrayList<>();
    private long idCounter = 1;

    public Student createStudent(Student student) {
        student.setId(idCounter++);
        students.add(student);
        return student;
    }

    public Student getStudentById(Long id) {
        return students.stream()
                .filter(student -> student.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Student not found"));
    }

    public List<Student> getAllStudents() {
        return students;
    }

    public Student updateStudent(Long id, Student updatedStudent) {
        Student student = getStudentById(id);
        student.setStudentName(updatedStudent.getStudentName());
        student.setStudentClass(updatedStudent.getStudentClass());
        return student;
    }

    public void deleteStudent(Long id) {
        Student student = getStudentById(id);
        students.remove(student);
    }
}
