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
public class Caller {
    public static void main(String[] args) {
        ElectronicDevice dev1 = new Television();
        dev1.turnOn();
    }
}
