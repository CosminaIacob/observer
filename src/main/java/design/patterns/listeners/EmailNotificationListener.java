package design.patterns.listeners;

import java.io.File;

public class EmailNotificationListener implements EventListener {

    private String email;

    public EmailNotificationListener(String email) {
        this.email = email;
    }

    @Override
    public void update(String eventTye, File file) {
        System.out.println("Email to " + email + ": Someone has performed " + eventTye);
    }
}
