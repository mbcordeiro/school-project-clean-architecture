package br.com.school.gamification.infra.seal;

import br.com.school.shared.domain.Cpf;
import br.com.school.gamification.domain.seal.Seal;
import br.com.school.gamification.domain.seal.SealRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SealRepositoryInMemory implements SealRepository {
    private List<Seal> seals = new ArrayList<>();

    @Override
    public void addSeal(Seal seal) {
        seals.add(seal);
    }

    @Override
    public List<Seal> findByCpf(Cpf cpf) {
        return seals.stream().filter(seal -> seal.getCpf().equals(cpf)).collect(Collectors.toList());
    }
}
