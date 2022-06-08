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
public class Inches_pg52 {

    public static void main(String args[]) {
        long ci;
        long im;

        im = 5280 * 12;

        ci = im * im * im;

        System.out.println("There are " + ci
                + " cubic inches in cubic mile.");

    }
}
