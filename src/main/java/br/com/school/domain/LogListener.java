package br.com.school.domain;

import br.com.school.domain.student.StudentRegisteredEvent;

import java.time.format.DateTimeFormatter;

public class LogListener extends Listener {
    @Override
    public void listenEvent(Event event) {
        final var momentFormat = event.momentEvent().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
        System.out.println(String.format("Student with CPF %s in: %s",
                ((StudentRegisteredEvent) event).getCpf(), momentFormat));
    }

    @Override
    protected boolean shouldProcess(Event event) {
        return event instanceof StudentRegisteredEvent;
    }
}
