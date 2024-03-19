package design.patterns.listeners;

import java.io.File;

public class LogOpenListener implements EventListener {

    private File log;

    public LogOpenListener(String filename) {
        this.log = new File(filename);
    }

    @Override
    public void update(String eventTye, File file) {
        System.out.println("Save to log " + log + ": Someone has performed " + eventTye);
    }
}
