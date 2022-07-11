package br.com.school.academic.domain.student;

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
}
