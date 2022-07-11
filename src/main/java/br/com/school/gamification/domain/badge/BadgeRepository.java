package br.com.school.gamification.domain.badge;

import br.com.school.shared.domain.Cpf;

import java.util.List;

public interface BadgeRepository {
    void addSeal(Badge badge);
    List<Badge> findByCpf(Cpf cpf);
}
