package design.patterns.listeners;

import java.io.File;

public interface EventListener {

    void update(String eventTye, File file);
}
