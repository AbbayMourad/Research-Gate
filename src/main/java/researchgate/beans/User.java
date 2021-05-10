package researchgate.beans;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue
    private int id;

    private String name;

    public User() {}

    public User(String name) {
        this.name = name;
    }
}
