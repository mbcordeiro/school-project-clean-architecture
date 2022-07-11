package br.com.school.academic.infra.student;

import br.com.school.academic.domain.student.Cpf;

public class StudentNotFoundException extends RuntimeException {
    private static final long serialVersionUID = 1L;
    public StudentNotFoundException(Cpf cpf) {
        super("Student not found with cpf:" + cpf);
    }
}
