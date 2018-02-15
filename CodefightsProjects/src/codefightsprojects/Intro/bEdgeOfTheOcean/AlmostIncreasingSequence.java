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
        for(int j = 1; j < sequence.length; j++){
            if(sequence[j] < sequence[j-1]){
                isSequence = false;
                break;
            }
        }
        for(int j = 0; j < sequence.length; j++){
            for(int k = 0; k < sequence.length; k++){
                if(k != j && k - 1 != j && k - 1 >= 0){
                    System.out.print(k);
                    if(sequence[k] > sequence[k-1]){
                        isSequence = true;
                    } else {
                        isSequence = false;
                        break;
                    }
                }
            }
        }
        return isSequence;
    }
}
