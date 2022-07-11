package br.com.school.academic.domain.student;

import java.util.List;

public interface StudentRepository {
    void register(Student student);

    Student findByCpf(Cpf cpf);

    List<Student> findAll();
}
