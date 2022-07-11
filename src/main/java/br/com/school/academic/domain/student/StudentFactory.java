package br.com.school.academic.domain.student;

import br.com.school.shared.domain.Cpf;

public class StudentFactory {
    private Student student;

    public StudentFactory withNameAndCpfAndEmail(String name, String cpf, String email) {
        student = new Student(name, new Cpf(cpf), new Email(email));
        return this;
    }

    public StudentFactory withTelephone(String ddd, String number) {
        student.addTelephones(ddd, number);
        return this;
    }

    public Student create() {
        return student;
    }
}
