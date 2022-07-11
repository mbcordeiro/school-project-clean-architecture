package br.com.school.shared.domain.event;

import java.time.LocalDateTime;
import java.util.Map;

public interface Event {
    LocalDateTime eventMoment();

    EventType eventType();

    Map<String, Object> eventInfo();
}
