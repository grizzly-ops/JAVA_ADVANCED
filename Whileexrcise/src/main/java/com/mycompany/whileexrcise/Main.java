/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.whileexrcise;

/**
 *
 * @author ndabenhle
 */
public class Main {
     public static void main(String[] args) {
        //	    int count = 1;
//        while (count != 6) {
//            System.out.println("Count Value = " + count);
//            count++;
//        }

//        Not identical to the while loop above
//        for (int i = 1; i < 7; i++) {
//            System.out.println("Count Value = " + count);
//        }

//        System.out.println("**********");
//
//        for (count= 1; count != 6; count++) {
//            System.out.println("Count Value = " + count);
//        }

//        DO NOT DO THIS
//        while (true) {
//            if (count == 6) {
//                break;
//            }
//            System.out.println("Count Value = " + count);
//            count++;
//        }

//        int count1 = 6;
//
//        while (count1 != 6) {
//            System.out.println("Count Value = " + count1);
//            count1++;
//        }
//
//        for (int i = 6; i != 6; i++) {
//            System.out.println("Count Value = " + count1);
//        }
//
//        count1 = 1;
//        do {
//            System.out.println("Count Value = " + count1);
//            count1++;
//
//            if (count1 > 100) {
//                break;
//            }
//        } while (count1 != 6);

//        int number = 4;
//        int finishNumber = 20;
//
//        while (number <= finishNumber) {
//            number++;
//
//            if (!isEvenNumber(number)) {
//                continue;
//            }
//
//            System.out.println("Even Number = " + number);
//        }

        int number = 4;
        int finishNumber = 20;
        int evenNumbersFound = 0;

        while (number <= finishNumber) {
            number++;

            if (!isEvenNumber(number)) {
                continue;
            }
            System.out.println("Even Number = " + number);

            evenNumbersFound++;
            if (evenNumbersFound >= 5) {
                break;
            }
        }

        System.out.println("Total even numbers found = " + evenNumbersFound);
    }

    public static boolean isEvenNumber(int number) {
        if ((number % 2) == 0) {
            return true;
        } else {
            return false;
        }
    }
}
