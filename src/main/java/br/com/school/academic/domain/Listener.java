package br.com.school.academic.domain;

public abstract class Listener {
    public void process(Event event) {
        if (shouldProcess(event))
            listenEvent(event);
    }

    protected abstract void listenEvent(Event event);
    protected abstract boolean shouldProcess(Event event);
}
