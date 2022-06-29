package br.com.school;

import br.com.school.application.student.register.RegisterStudent;
import br.com.school.application.student.register.RegisterStudentDto;
import br.com.school.domain.student.Student;
import br.com.school.infra.student.StudentRepositoryInMemory;

public class RegisterStudentMain {
    public static void main(String[] args) {
        final var name = "Name Fullname";
        final var cpf = "123.456.789-00";
        final var email = "email@email.com";

        final var registerStudent = new RegisterStudent(new StudentRepositoryInMemory());
        registerStudent.execute(new RegisterStudentDto(name, cpf, email));
    }
}
