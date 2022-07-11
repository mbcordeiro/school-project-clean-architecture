package br.com.school.shared.domain.event;

public abstract class Listener {
    public void process(Event event) {
        if (shouldProcess(event))
            listenEvent(event);
    }

    protected abstract void listenEvent(Event event);
    protected abstract boolean shouldProcess(Event event);
}
