package br.com.school.gamification.application;

import br.com.school.gamification.domain.badge.Badge;
import br.com.school.gamification.domain.badge.BadgeRepository;
import br.com.school.shared.domain.Cpf;
import br.com.school.shared.domain.event.Event;
import br.com.school.shared.domain.event.EventType;
import br.com.school.shared.domain.event.Listener;

public class GenerateRookieStudentBadge extends Listener {
    private final BadgeRepository badgeRepository;

    public GenerateRookieStudentBadge(BadgeRepository badgeRepository) {
        this.badgeRepository = badgeRepository;
    }

    @Override
    protected void listenEvent(Event event) {
        badgeRepository.addSeal(new Badge((Cpf) event.eventInfo().get("cpf"), "Rookie Badge"));
    }

    @Override
    protected boolean shouldProcess(Event event) {
        return EventType.STUDENT_REGISTERED.equals(event.eventType());
    }
}
