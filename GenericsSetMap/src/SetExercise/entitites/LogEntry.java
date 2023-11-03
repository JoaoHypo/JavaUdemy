package SetExercise.entitites;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class LogEntry implements Comparable<LogEntry>{
    private String username;
    private List<Instant> loginTime = new ArrayList<>();

    public LogEntry(String username, Instant loginTime) {
        this.username = username;
        this.loginTime.add(loginTime);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<Instant> getLoginTime() {
        return loginTime;
    }

    public void addLoginTime(Instant loginTime) {
        this.loginTime.add(loginTime);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LogEntry logEntry = (LogEntry) o;
        return Objects.equals(getUsername(), logEntry.getUsername());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUsername());
    }

    @Override
    public int compareTo(LogEntry o) {
        return getUsername().toUpperCase().compareTo(o.getUsername().toUpperCase());
    }

    @Override
    public String toString() {
        return "Username='" + username + '\n' +
                "LoginTimes=" + loginTime;
    }
}
