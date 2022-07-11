package br.com.school.academic.domain.student;

import br.com.school.shared.domain.Cpf;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private Cpf cpf;
    private Email email;

    private String password;

    private List<Telephone> telephones = new ArrayList<>();

    public Student(String name, Cpf cpf, Email email) {
        this.name = name;
        this.cpf = cpf;
        this.email = email;
    }

    public void addTelephones(String ddd, String number) {
        if (telephones.size() == 2)
            throw new IllegalArgumentException("Maximum number of phones exceeded");
        telephones.add(new Telephone(ddd, number));
    }

    public String getName() {
        return name;
    }

    public Cpf getCpf() {
        return cpf;
    }

    public Email getEmail() {
        return email;
    }

    public List<Telephone> getTelephones() {
        return telephones;
    }
}
