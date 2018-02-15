/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codefightsprojects.Intro;

/**
 * Task: Given a year, return the century it is in. The first 
 * century spans from the year 1 up to and including the year 100, 
 * the second - from the year 101 up to and including the 
 * year 200, etc.
 * @author Kepler
 */

public class CenturyFromYear {
    int centuryFromYear(int year) {
        int century = 0;
        int yearEdit = year;
        while(yearEdit > 99){
            century++;
            yearEdit -= 100;
        }
        if(yearEdit != 0){
            century++;
        }
        return century;
    }

}
