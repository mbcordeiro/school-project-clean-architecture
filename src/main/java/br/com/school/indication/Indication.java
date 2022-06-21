package br.com.school.indication;

import br.com.school.student.Student;

import java.time.LocalDateTime;

public class Indication {
    private Student indicator;
    private Student indicated;
    private LocalDateTime indicationDate;

    public Indication(Student indicator, Student indicated) {
        this.indicator = indicator;
        this.indicated = indicated;
        this.indicationDate = LocalDateTime.now();
    }

    public Student getIndicator() {
        return indicator;
    }

    public Student getIndicated() {
        return indicated;
    }

    public LocalDateTime getIndicationDate() {
        return indicationDate;
    }
}
