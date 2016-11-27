/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geneticalgorithm;

/**
 *
 * @author rizzauliarahman
 */
public class Adjacent {
    private float weight;
    private int distance;
    private int speed;
    private char label;

    public Adjacent(char label, int distance, int speed) {
        this.distance = distance;
        this.speed = speed;
        this.label = label;
        weight = this.distance / this.speed;
    }
    
}
