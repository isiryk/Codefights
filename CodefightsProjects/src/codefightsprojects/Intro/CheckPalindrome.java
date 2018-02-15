/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codefightsprojects.Intro;

/**
 * Task: Given the string, check if it is a palindrome.
 * @author Kepler
 */
public class CheckPalindrome {
    boolean checkPalindrome(String inputString) {
        boolean palin = true;
        for(int j = 0; j < inputString.length(); j++){
            if(inputString.charAt(j) != inputString.charAt(inputString.length() - j - 1)){
                palin = false;
            }
        }
        return palin;
    }
}
