package br.com.school.application.student.register;

import br.com.school.domain.student.Cpf;
import br.com.school.domain.student.Email;
import br.com.school.domain.student.Student;

public class RegisterStudentDto {
    private String name;
    private String cpf;
    private String email;

    public RegisterStudentDto(String name, String cpf, String email) {
        this.name = name;
        this.cpf = cpf;
        this.email = email;
    }

    public Student createStudent() {
        return new Student(name, new Cpf(cpf), new Email(email));
    }
}
