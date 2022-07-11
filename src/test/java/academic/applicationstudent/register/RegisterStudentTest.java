package academic.applicationstudent.register;

import br.com.school.academic.application.student.register.RegisterStudentDto;
import br.com.school.academic.application.student.register.RegisterStudent;
import br.com.school.shared.domain.event.PublisherEvent;
import br.com.school.shared.domain.Cpf;
import br.com.school.academic.domain.student.Student;
import br.com.school.academic.infra.student.StudentRepositoryInMemory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RegisterStudentTest {
    @Test
    void ShouldPersistStudent() {
        final var studentRepositoryInMemory = new StudentRepositoryInMemory();
        final var publisherEvent = new PublisherEvent();
        final var registerStudent = new RegisterStudent(studentRepositoryInMemory, publisherEvent);

        final var registerStudentDto =
                new RegisterStudentDto("Name Fullname", "123.456.789-00", "email@email.com");

        registerStudent.execute(registerStudentDto);

        Student studentFind = studentRepositoryInMemory.findByCpf(new Cpf("123.456.789-00"));
        assertEquals("Fulano", studentFind.getName());
        assertEquals("123.456.789-00", studentFind.getCpf());
        assertEquals("fulano@email.com", studentFind.getEmail());

    }
}
