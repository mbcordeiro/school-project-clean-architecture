package br.com.school.infra.indication;

import br.com.school.application.indication.SendEmailIndication;
import br.com.school.domain.student.Student;

public class SendEmailIndicationJavaMail implements SendEmailIndication {
    @Override
    public void sendTo(Student student) {
        System.out.println("Send email to:" + student);
    }
}
