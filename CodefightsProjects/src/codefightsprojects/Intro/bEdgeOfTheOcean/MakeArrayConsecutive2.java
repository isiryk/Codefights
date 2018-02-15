/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codefightsprojects.Intro.bEdgeOfTheOcean;

/**
 * Task: Ratiorg got statues of different sizes as a present from CodeMaster 
 * for his birthday, each statue having an non-negative integer size. Since he 
 * likes to make things perfect, he wants to arrange them from smallest to 
 * largest so that each statue will be bigger than the previous one exactly by 1. 
 * He may need some additional statues to be able to accomplish that. Help him 
 * figure out the minimum number of additional statues needed.
 * 
 * Example:
 * For statues = [6, 2, 3, 8], the output should be
 * makeArrayConsecutive2(statues) = 3.
 * Ratiorg needs statues of sizes 4, 5 and 7.
 * 
 * @author Kepler
 */
public class MakeArrayConsecutive2 {
    int makeArrayConsecutive2(int[] statues) {
        int totalNeeded = 0;
        int smallest = statues[0];
        int largest = statues[0];
        for(int j = 0; j < statues.length; j++){
            if(smallest > statues[j]){
                smallest = statues[j];
            }
            if(largest < statues[j]){
                largest = statues[j];
            }
        }
        int difference = largest - smallest + 1;
        totalNeeded = difference - statues.length;
        return totalNeeded;
    }
}
