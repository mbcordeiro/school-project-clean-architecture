package br.com.school.domain.student;

import br.com.school.domain.Event;

import java.time.LocalDateTime;

public class StudentRegisteredEvent implements Event {
    private final Cpf cpf;
    private final LocalDateTime momentEvent;

    public StudentRegisteredEvent(Cpf cpf) {
        this.cpf = cpf;
        this.momentEvent = LocalDateTime.now();
    }

    @Override
    public LocalDateTime momentEvent() {
        return momentEvent;
    }

    public Cpf getCpf() {
        return cpf;
    }
}
