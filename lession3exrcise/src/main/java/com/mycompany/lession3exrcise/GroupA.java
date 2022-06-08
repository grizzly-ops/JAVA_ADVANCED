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
public class GroupA extends Students{
    
    private boolean Attendance;
     
    
    public GroupA(String firstname,String lastname,String email,String GitHubLink,boolean Attendance){
        super(firstname, lastname, email, GitHubLink);
        this.Attendance = Attendance;
    }

    public boolean isAttendance() {
        return Attendance;
    }

    public void setAttendance(boolean Attendance) {
        this.Attendance = Attendance;
    }
    
    
    
}
