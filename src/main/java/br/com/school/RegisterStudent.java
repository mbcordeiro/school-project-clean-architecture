package br.com.school;

import br.com.school.domain.student.Cpf;
import br.com.school.domain.student.Email;
import br.com.school.domain.student.Student;
import br.com.school.infra.student.StudentRepositoryInMemory;

public class RegisterStudent {
    public static void main(String[] args) {
        final var name = "Name Fullname";
        final var cpf = new Cpf("123.456.789-00");
        final var email = new Email("email@email.com");

        final var student = new Student(name, cpf, email);
        final var studentRepositoryInMemory = new StudentRepositoryInMemory();
        studentRepositoryInMemory.register(student);
    }
}
