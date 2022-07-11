package br.com.school.gamification.domain.seal;

import br.com.school.academic.domain.student.Cpf;

import java.util.List;

public interface SealRepository {
    void addSeal(Seal seal);
    List<Seal> findByCpf(Cpf cpf);
}
