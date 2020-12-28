package com.example.pandemicshopping.Model;

public class Post {
    private String postid;
    private String postimage;
    private String title;
    private String location;
    private String description;
    private String username;

    public Post(String postid, String postimage, String title_of_post, String location, String description, String username) {
        this.postid = postid;
        this.postimage = postimage;
        this.title = title;
        this.location = location;
        this.description = description;
        this.username = username;
    }

    public Post() {
    }

    public String getPostid() {
        return postid;
    }

    public void setPostid(String postid) {
        this.postid = postid;
    }

    public String getPostimage() {
        return postimage;
    }

    public void setPostimage(String postimage) {
        this.postimage = postimage;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPublisher() {
        return username;
    }

    public void setPublisher(String publisher) {
        this.username = publisher;
    }
}
