/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.util.HashSet;

/**
 *
 * @author Namayan
 */
class user {
    private String username;
    private String password;
    private String bio;
    private int countFollowings;
    private int countFollowers;
    private int countPosts;
    private int id;
    user[] followers = new user[10];
    user[] followings = new user[10];
    public post[] posts = new post[10];

    public user(String username, String password, int id) {
        this.username = username;
        this.password = password;
        this.id = id;
        for(int i=0; i<10; i++){
            posts[i] = new post();
        }
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
    
    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public int getCountFollowings() {
        return countFollowings;
    }

    public int getCountFollowers() {
        return countFollowers;
    }

    public int getCountPosts() {
        return countPosts;
    }

    public void setCountFollowings(int countFollowings) {
        this.countFollowings = countFollowings;
    }

    public void setCountFollowers(int countFollowers) {
        this.countFollowers = countFollowers;
    }

    public void setCountPosts(int countPosts) {
        this.countPosts = countPosts;
    }
    
    //methods:
    
    public void follow(user u){
        this.followings[countFollowings] = u;
        this.countFollowings++;
        u.followers[u.countFollowers] = this;
        u.countFollowers++;
    } 
    
    public void addPost(String cap){
        post p = new post();
        this.posts[countPosts] = p;
        p.setCaption(cap);
        p.setNumber(countPosts+1);
        p.setId(countPosts+100);
        p.setLikes(0);
        countPosts++;
    }
    
    
}
