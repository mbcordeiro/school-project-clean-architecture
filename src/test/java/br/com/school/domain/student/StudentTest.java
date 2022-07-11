package br.com.school.domain.student;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class StudentTest {
    private Student student;

    @BeforeEach
    void beforeEach() {
        student = new Student("Name Fullname", new Cpf("123.456.789-00"),
                new Email("email@email.com"));
    }

    @Test
    void shouldAddOneTelephone() {
        student.addTelephones("47", "999999999");
        assertEquals(1, student.getTelephones().size());
    }

    @Test
    void shouldAddTwoTelephones() {
        for (int i = 0; i < 2; i++) {
            student.addTelephones("47", "999999999");
        }
        assertEquals(2, student.getTelephones().size());
    }

    @Test
    void shouldReturnErrorWhenExceedsTheMaximumNumberOfRegisteredTelephones() {
        assertThrows(IllegalArgumentException.class, () -> {
            for (int i = 0; i < 3; i++) {
                student.addTelephones("47", "999999999");
            }
        });
    }
}
