package br.com.school.application.student.register;

import br.com.school.domain.student.Student;
import br.com.school.domain.student.StudentRepository;

public class RegisterStudent {
    private final StudentRepository studentRepository;

    public RegisterStudent(StudentRepository repository) {
        this.studentRepository = repository;
    }

    public void execute(RegisterStudentDto registerStudentDto) {
        Student newStudent = registerStudentDto.createStudent();
        studentRepository.register(newStudent);
    }
}
