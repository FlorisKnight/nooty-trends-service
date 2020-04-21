package models;

public class Noot {

    public Noot(String id, String text, String timestamp, User user) {
        this.id = id;
        this.text = text;
        this.timestamp = timestamp;
        this.user = user;
    }

    public Noot(String text, String timestamp, User user) {
        this.text = text;
        this.timestamp = timestamp;
        this.user = user;
    }

    public String id;
    public String text;
    public String timestamp;
    public User user;
}
