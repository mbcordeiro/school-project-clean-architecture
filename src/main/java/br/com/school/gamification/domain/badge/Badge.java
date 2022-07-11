package br.com.school.gamification.domain.badge;

import br.com.school.shared.domain.Cpf;

public class Badge {
    private Cpf cpf;
    private String name;

    public Badge(Cpf cpf, String name) {
        this.cpf = cpf;
        this.name = name;
    }

    public Cpf getCpf() {
        return cpf;
    }

    public String getName() {
        return name;
    }
}

