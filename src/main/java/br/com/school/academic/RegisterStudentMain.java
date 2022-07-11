package br.com.school.academic;

import br.com.school.academic.application.student.register.RegisterStudent;
import br.com.school.academic.application.student.register.RegisterStudentDto;
import br.com.school.academic.domain.LogListener;
import br.com.school.academic.domain.PublisherEvent;
import br.com.school.academic.infra.student.StudentRepositoryInMemory;

public class RegisterStudentMain {
    public static void main(String[] args) {
        final var name = "Name Fullname";
        final var cpf = "123.456.789-00";
        final var email = "email@email.com";

        final var publisherEvent = new PublisherEvent();
        publisherEvent.addListener(new LogListener());
        final var registerStudent = new RegisterStudent(new StudentRepositoryInMemory(), publisherEvent);
        registerStudent.execute(new RegisterStudentDto(name, cpf, email));
    }
}
