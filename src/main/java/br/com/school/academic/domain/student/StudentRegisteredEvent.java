package br.com.school.academic.domain.student;

import br.com.school.shared.domain.event.Event;
import br.com.school.shared.domain.Cpf;
import br.com.school.shared.domain.event.EventType;

import java.time.LocalDateTime;
import java.util.Map;

public class StudentRegisteredEvent implements Event {
    private final Cpf cpf;
    private final LocalDateTime momentEvent;

    public StudentRegisteredEvent(Cpf cpf) {
        this.cpf = cpf;
        this.momentEvent = LocalDateTime.now();
    }

    @Override
    public LocalDateTime eventMoment() {
        return momentEvent;
    }

    @Override
    public EventType eventType() {
        return EventType.STUDENT_REGISTERED;
    }

    @Override
    public Map<String, Object> eventInfo() {
        return Map.of("cpf", cpf);
    }

    public Cpf getCpf() {
        return cpf;
    }
}
