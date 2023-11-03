package SetExercise2.entities;

import java.util.HashSet;
import java.util.Set;

public class Course {
    private String name;
    private Set<Integer> users = new HashSet<>();

    public Course(String name) {
        this.name = name;
    }

    public Set<Integer> getUsers(){
        return users;
    }

    public void addUser(int userId){
        users.add(userId);
    }

}
