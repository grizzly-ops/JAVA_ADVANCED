package com.mycompany.lesson5;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ndabenhle
 */
public enum PowerState {
    ON("The power usage is high."),
    OFF("The power is off."),
    SUSPEND("The power usage is low");
        
    private String description;
    private PowerState(String d){
        description = d;
    }

    public String getDescription(){
        return description;
    }

}
