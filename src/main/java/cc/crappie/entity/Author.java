package cc.crappie.entity;

import java.util.ArrayList;
import java.util.List;

public class Author {
    private String name;
    private Long id;
    private String password;
    private String email;

    public Author setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }

    public Author setId(Long id) {
        this.id = id;
        return this;
    }

    public Author setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getPassword(){
        return password;
    }

    public Author setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getEmail() {
        return email;
    }
}
