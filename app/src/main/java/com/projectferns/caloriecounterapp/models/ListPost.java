package com.projectferns.caloriecounterapp.models;

/**
 * Created by stephen on 7/12/14.
 */
public class ListPost {

    private String title;
    private String message;

    private Author author;

    private int calories;
    private int post_id;

    public ListPost(int post_id, Author author) {
        this.post_id = post_id;
        this.author = author;
    }

    public Author getAuthor() {
        return author;
    }

    public int getPostID() {
        return this.post_id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {return title;}

    public void setMessage(String message){
        this.message = message;
    }
    public String getMessage() {return message;}



    public void setCalories(int calories) {

    }

}
