/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codefightsprojects.Intro;

/**
 * Task: Below we will define an n-interesting polygon. Your task is to find 
 * the area of a polygon for a given n.

 * A 1-interesting polygon is just a square with a side of length 1. An 
 * n-interesting polygon is obtained by taking the n - 1-interesting polygon 
 * and appending 1-interesting polygons to its rim, side by side. You can see 
 * the 1-, 2-, 3- and 4-interesting polygons in the picture below.
 * @author Kepler
 */
public class ShapeArea {
    int shapeArea(int n) {
        int answer = 1;
        for(int j = 1; j < n; j++){
            System.out.println(answer);
            answer += 4 * j;
        }
        return answer;
    }

//Pattern: 1->5->13->25->41
//Hop: 4+8+12+16
}
