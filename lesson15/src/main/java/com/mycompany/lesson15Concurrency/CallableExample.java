/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lesson15Concurrency;

import java.util.Random;

/**
 *
 * @author ndabenhle
 */
public class CallableExample {
        public Object call() throws Exception
    {
        // Create random number generator
        Random generator = new Random();
  
        Integer randomNumber = generator.nextInt(5);
  
        // To simulate a heavy computation,
        // we delay the thread for some random time
        Thread.sleep(randomNumber * 1000);
  
        return randomNumber;
    }
}
