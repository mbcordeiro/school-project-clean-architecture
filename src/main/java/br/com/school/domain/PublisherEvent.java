package br.com.school.domain;

import java.util.ArrayList;
import java.util.List;

public class PublisherEvent {
    public List<Listener> listeners = new ArrayList<>();

    public void addListener(Listener listener) {
        listeners.add(listener);
    }

    public void publisher(Event event) {
        listeners.forEach(listener -> listener.process(event));
    }
}
