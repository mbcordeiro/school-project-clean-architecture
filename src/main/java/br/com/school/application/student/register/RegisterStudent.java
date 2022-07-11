package br.com.school.application.student.register;

import br.com.school.domain.PublisherEvent;
import br.com.school.domain.student.Student;
import br.com.school.domain.student.StudentRegisteredEvent;
import br.com.school.domain.student.StudentRepository;

public class RegisterStudent {
    private final StudentRepository studentRepository;
    private final PublisherEvent publisherEvent;

    public RegisterStudent(StudentRepository repository, PublisherEvent publisherEvent) {
        this.studentRepository = repository;
        this.publisherEvent = publisherEvent;
    }

    public void execute(RegisterStudentDto registerStudentDto) {
        Student newStudent = registerStudentDto.createStudent();
        studentRepository.register(newStudent);
        publisherEvent.publisher(new StudentRegisteredEvent(registerStudentDto.createStudent().getCpf()));
    }
}
