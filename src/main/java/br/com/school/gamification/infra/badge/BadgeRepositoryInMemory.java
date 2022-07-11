package br.com.school.gamification.infra.badge;

import br.com.school.shared.domain.Cpf;
import br.com.school.gamification.domain.badge.Badge;
import br.com.school.gamification.domain.badge.BadgeRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BadgeRepositoryInMemory implements BadgeRepository {
    private List<Badge> badges = new ArrayList<>();

    @Override
    public void addSeal(Badge badge) {
        badges.add(badge);
    }

    @Override
    public List<Badge> findByCpf(Cpf cpf) {
        return badges.stream().filter(badge -> badge.getCpf().equals(cpf)).collect(Collectors.toList());
    }
}
