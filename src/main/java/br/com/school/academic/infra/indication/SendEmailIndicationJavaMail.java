package br.com.school.academic.infra.indication;

import br.com.school.academic.application.indication.SendEmailIndication;
import br.com.school.academic.domain.student.Student;

public class SendEmailIndicationJavaMail implements SendEmailIndication {
    @Override
    public void sendTo(Student student) {
        System.out.println("Send email to:" + student);
    }
}
