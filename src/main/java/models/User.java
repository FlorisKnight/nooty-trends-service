package models;

public class User {
    public User() {
    }

    public User(String id, String username, String email, String displayname) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.displayname = displayname;
    }

    public String id;
    public String username;
    public String password;
    public String email;
    public String displayname;
}
