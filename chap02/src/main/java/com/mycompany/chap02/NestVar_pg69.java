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
public class NestVar_pg69 {

    public static void main(String args[]) {
        int count;

        for (count = 0; count < 10; count = count + 1) {
            System.out.println("This is count: " + count);

            for (count = 0; count < 2; count++) {
                System.out.println("This program is in error!");
            }
        }
    }
}
