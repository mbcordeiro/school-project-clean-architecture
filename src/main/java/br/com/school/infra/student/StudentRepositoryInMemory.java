package br.com.school.infra.student;

import br.com.school.domain.student.Cpf;
import br.com.school.domain.student.Student;
import br.com.school.domain.student.StudentRepository;

import java.util.ArrayList;
import java.util.List;

public class StudentRepositoryInMemory implements StudentRepository {
    private List<Student> studentList = new ArrayList<Student>();

    @Override
    public void register(Student student) {
        studentList.add(student);
    }

    @Override
    public Student findByCpf(Cpf cpf) {
        return studentList.stream().filter(student -> student.getCpf().equals(cpf)).findFirst().orElseThrow();
    }

    @Override
    public List<Student> findAll() {
        return studentList;
    }
}
