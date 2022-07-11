package br.com.school.domain.seal;

import br.com.school.domain.student.Cpf;

import java.util.List;

public interface SealRepository {
    void addSeal(Seal seal);
    List<Seal> findByCpf(Cpf cpf);
}
