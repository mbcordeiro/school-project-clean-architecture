package br.com.school.application.indication;

import br.com.school.domain.student.Student;

public interface SendEmailIndication {
    void sendTo(Student student);
}
