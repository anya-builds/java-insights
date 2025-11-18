package three.project;

import java.util.Set;

public class User {
    private String name;
    private boolean active;
    private Set<String> roles;

    public User(boolean active,String name, Set<String> roles){
        this.active=active;
        this.active=active;
        this.roles=roles;
    }

    public String getName() {
        return name;
    }

    public Set<String> getRoles() {
        return roles;
    }
    public boolean isActive(){
        return active;
    }
}
