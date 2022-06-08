/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.digitsumchallange;

/**
 *
 * @author ndabenhle
 */
public class Main {
    public static void main(String[] args) {

        System.out.println("The sum the digits in number 125 is " + sumDigits(125));
        System.out.println("The sum the digits in number -125 is " + sumDigits(-125));
        System.out.println("The sum the digits in number 4 is " + sumDigits(4));
        System.out.println("The sum the digits in number 3212 is " + sumDigits(3212));


    }

    private static int sumDigits(int number) {

        if(number < 10){
            return -1;
        }

        int sum = 0;

        //125 -> 125 / 10 = 12 -> 12 * 10 = 120 -> 125 - 120 = 5
        while (number >0) {
            // extract the lest-significant digit
            int digit = number % 10;
            sum += digit;

            //drop the least -significant digit
            number /= 10; // same as number = number / 10;

        }
        return  sum;
    }
}
