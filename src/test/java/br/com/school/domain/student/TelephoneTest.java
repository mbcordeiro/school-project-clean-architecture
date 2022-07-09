package br.com.school.domain.student;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class TelephoneTest {
    @Test
    void shouldNotCreateTelephoneInvalid() {
        assertThrows(IllegalArgumentException.class, () -> new Telephone(null, null));
        assertThrows(IllegalArgumentException.class, () -> new Telephone("", ""));
        assertThrows(IllegalArgumentException.class, () -> new Telephone("invalid", "invalid"));
    }

    @Test
    void shouldCreateTelephoneValid() {
        final var telephone = new Telephone("47", "999999999");
        assertEquals("999999999", telephone.getNumber());
        assertEquals("47", telephone.getDdd());
    }

    @Test
    void shouldReturnErrorWhenExceedsTheMaximumNumberOfRegisteredTelephones() {
        final var student =
                new Student("Name", new Cpf("123.456.789-00"), new Email("email@email.com"));
        student.addTelephones("47", "999999999");
        student.addTelephones("47", "999999999");
        assertThrows(IllegalArgumentException.class, () -> student.addTelephones("47", "999999999"));
    }
}
