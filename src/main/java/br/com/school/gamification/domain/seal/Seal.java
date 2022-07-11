package br.com.school.gamification.domain.seal;

import br.com.school.shared.domain.Cpf;

public class Seal {
    private Cpf cpf;
    private String name;

    public Seal(Cpf cpf, String name) {
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

