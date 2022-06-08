/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.chap02;

/**
 *
 * @author ndabenhle
 */
public class ModDemo_pg70 {

    public static void main(String args[]) {
        int iresult, irem;
        double dresult, drem;

        iresult = 10 / 3;
        irem = 10 % 3;

        dresult = 10.0 / 3.0;
        drem = 10.0 % 3.0;

        System.out.println("Result and remainder of 10 / 3: "
                + iresult + " " + irem);
        System.out.println("Result and remainder of 10.0 / 3.0: "
                + dresult + " " + drem);

    }
}
