/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lession3exrcise;

/**
 *
 * @author ndabenhle
 */
public class Students {
    public String firstname;
    public String lastname;
    public  String email;
    public String GitHubLink;

    public Students(String firstname, String lastname, String email, String GitHubLink) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.GitHubLink = GitHubLink;
    }
    
    public void display(){
        System.out.println("firstname: " + getFirstname());
        System.out.println("lastname: " +getLastname());
        System.out.println("email: " + getEmail()); 
        System.out.println("GitHubLink: " + getGitHubLink());
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGitHubLink() {
        return GitHubLink;
    }

    public void setGitHubLink(String GitHubLink) {
        this.GitHubLink = GitHubLink;
    }
    
    

}
