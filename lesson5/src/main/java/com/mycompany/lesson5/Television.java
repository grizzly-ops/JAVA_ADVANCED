/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lesson5;

/**
 *
 * @author ndabenhle
 */
public class Television extends ElectronicDevice {
    

    @Override
    public void turnOn() {
        initializeScreen();
        changeChannel(1);
    }

    @Override
    public void turnOff() {
        System.out.println("TV turned off.");
    }

    public void changeChannel(int channel) {
        System.out.println("Channel changed to " + channel);
    }

    public void initializeScreen() {
        System.out.println("TV turned on..");
    }
}
    

