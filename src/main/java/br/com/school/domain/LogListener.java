package br.com.school.domain;

import br.com.school.domain.student.StudentRegisteredEvent;

import java.time.format.DateTimeFormatter;

public class LogListener {
    public void listenEvent(StudentRegisteredEvent studentRegisteredEvent) {
        final var momentFormat =
                studentRegisteredEvent.momentEvent().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
        System.out.println(String.format("Student with CPF %s in: %s", studentRegisteredEvent.getCpf(), momentFormat));
    }
}
