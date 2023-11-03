package SetExercise.entitites;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Objects;

public class User implements Comparable<User>{
    private String username;
    private Instant loginTime;

    public User(String username, Instant loginTime) {
        this.username = username;
        this.loginTime = loginTime;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Instant getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Instant loginTime) {
        this.loginTime = loginTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(getUsername(), user.getUsername());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUsername());
    }

    @Override
    public int compareTo(User o) {
        return getUsername().toUpperCase().compareTo(o.getUsername().toUpperCase());
    }
}
