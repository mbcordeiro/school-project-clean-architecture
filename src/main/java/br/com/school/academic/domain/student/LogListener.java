package br.com.school.academic.domain.student;

import br.com.school.shared.domain.event.Event;
import br.com.school.shared.domain.event.EventType;
import br.com.school.shared.domain.event.Listener;

import java.time.format.DateTimeFormatter;

public class LogListener extends Listener {
    @Override
    public void listenEvent(Event event) {
        final var momentFormat = event.eventMoment().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
        System.out.println(String.format("Student with CPF %s in: %s",
                ((StudentRegisteredEvent) event).getCpf(), momentFormat));
    }

    @Override
    protected boolean shouldProcess(Event event) {
        return EventType.STUDENT_REGISTERED.equals(event.eventType());
    }
}
