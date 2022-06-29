package br.com.school.applicationstudent.register;

import br.com.school.application.student.register.RegisterStudent;
import br.com.school.application.student.register.RegisterStudentDto;
import br.com.school.domain.student.Cpf;
import br.com.school.domain.student.Student;
import br.com.school.infra.student.StudentRepositoryInMemory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RegisterStudentTest {
    @Test
    void ShouldPersistStudent() {
        StudentRepositoryInMemory studentRepositoryInMemory = new StudentRepositoryInMemory();
        RegisterStudent registerStudent = new RegisterStudent(studentRepositoryInMemory);

        RegisterStudentDto registerStudentDto =
                new RegisterStudentDto("Name Fullname", "123.456.789-00", "email@email.com");

        registerStudent.execute(registerStudentDto);

        Student studentFind = studentRepositoryInMemory.findByCpf(new Cpf("123.456.789-00"));
        assertEquals("Fulano", studentFind.getName());
        assertEquals("123.456.789-00", studentFind.getCpf());
        assertEquals("fulano@email.com", studentFind.getEmail());

    }
}
