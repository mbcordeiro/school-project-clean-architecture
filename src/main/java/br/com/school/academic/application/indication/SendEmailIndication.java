package br.com.school.academic.application.indication;

import br.com.school.academic.domain.student.Student;

public interface SendEmailIndication {
    void sendTo(Student student);
}
