package br.com.school.domain.student;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private Cpf cpf;
    private Email email;
    private List<Telephone> telephones = new ArrayList<>();

    public Student(String name, Cpf cpf, Email email) {
        this.name = name;
        this.cpf = cpf;
        this.email = email;
    }

    public void addTelephones(String ddd, String number) {
        telephones.add(new Telephone(ddd, number));
    }
}
