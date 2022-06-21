package br.com.school.student;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmailTest {
    @Test
    void shouldNotCreateEmailInvalid() {
        assertThrows(IllegalArgumentException.class, () -> new Email(null));
        assertThrows(IllegalArgumentException.class, () -> new Email(""));
        assertThrows(IllegalArgumentException.class, () -> new Email("invalid"));
    }

    @Test
    void shouldCreateEmailValid() {
        final var email = new Email("email@email.com");
        assertEquals(email.getAddress(), "email@email.com");
    }
}
