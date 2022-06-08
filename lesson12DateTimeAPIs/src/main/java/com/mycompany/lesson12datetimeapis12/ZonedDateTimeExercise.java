/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lesson12datetimeapis12;

import java.time.LocalDate;
import java.time.LocalTime;
import static java.time.Month.JANUARY;
import java.time.ZoneId;
import java.time.ZonedDateTime;


/**
 *
 * @author ndabenhle
 */
public class ZonedDateTimeExercise {
    public static void main(String[] args) {
        ZoneId SASouth = ZoneId.of("GMT+2");
        LocalDate date = LocalDate.of(2021, JANUARY, 24);
        LocalTime time = LocalTime.of(4, 35);
        
        ZonedDateTime Meeting = ZonedDateTime.of(date, time, SASouth );
        
        System.out.println("Meeting in 2022 :" + Meeting);
        
    }
 
}
