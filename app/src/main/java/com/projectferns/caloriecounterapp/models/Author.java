package com.projectferns.caloriecounterapp.models;

/**
 * Created by stephen on 7/12/14.
 */
public class Author {

    private String firstName;
    private String lastName;
    private String email;
    private String username;

    private int author_id;

    public Author(int id) {
        this.author_id = id;
    }

    public void setFirstName(String first) {
        firstName = first;
    }

    public void setLastName(String last) {
        lastName = last;
    }

    public String getLastName() {return lastName;}
    public String getFirstName() {return firstName;}

    public void setEmail(String email) {
        this.email = email;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {return username;}

}
