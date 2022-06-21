package br.com.school.student;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CpfTest {
    @Test
    void shouldNotCreateCpfInvalid() {
        assertThrows(IllegalArgumentException.class, () -> new Cpf(null));
        assertThrows(IllegalArgumentException.class, () -> new Cpf(""));
        assertThrows(IllegalArgumentException.class, () -> new Cpf("invalid"));
    }

    @Test
    void shouldCreateCpfValid() {
        final var cpf = new Cpf("123.456.789-00");
        assertEquals(cpf.getNumber(), "123.456.789-00");
    }
}
