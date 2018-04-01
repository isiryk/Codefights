/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codefightsprojects.Intro.bEdgeOfTheOcean;

/**
 * Task: Given a sequence of integers as an array, determine whether it is 
 * possible to obtain a strictly increasing sequence by removing no more than 
 * one element from the array.
 * 
 * Example:
 * For sequence = [1, 3, 2, 1], the output should be
 * almostIncreasingSequence(sequence) = false;
 *
 * There is no one element in this array that can be removed in order to get a
 * strictly increasing sequence.
 *
 * For sequence = [1, 3, 2], the output should be
 * almostIncreasingSequence(sequence) = true.
 *
 * You can remove 3 from the array to get the strictly increasing sequence [1,
 * 2]. Alternately, you can remove 2 to get the strictly increasing sequence [1,
 * 3].
 * @author Kepler
 */
public class AlmostIncreasingSequence {
    boolean almostIncreasingSequence(int[] sequence) {
    boolean isSequence = true;
    boolean strike = false;
    for(int j = 0; j < sequence.length; j++){
        int test = j + 1;
        if(test >= sequence.length){
            break;
        }
        if((sequence[j] >= sequence[j+1]) && (test < sequence.length)){
            int test2 = j + 2;
            boolean test2notokay = false;
            if(test2 >= sequence.length){
                test2notokay = true;
            }
            if(strike == false && test2notokay == false){
                if(sequence[j]<sequence[j+2]){
                    strike = true;
                    j++;
                }  
            }
            else if(strike == false){
                strike = true;
                if(test2 >= sequence.length){
                    break;
                }
                else if(j == 0){
                    continue;
                }
                else if(sequence[j] >= sequence[j+2] && (test2 < sequence.length)){
                    int test3 = j+3;
                    if(test3 >= sequence.length){
                        isSequence = false;
                        break;
                    }
                    else if(sequence[j] < sequence[j+2] && 
                            sequence[j+1] < sequence[j+2] && 
                            test3 < sequence.length){
                        j++;
                    } else {
                        isSequence = false;
                        break;
                    }
                }
                else{
                    j++;
                }
            } 
            else {
                isSequence = false;
                break;
            }
        } 
    }
    return isSequence;
}

}
