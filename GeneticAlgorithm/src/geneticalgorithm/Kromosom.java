/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geneticalgorithm;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Asprak-69
 */
public class Kromosom {
    long fitness;
    List<Character> route = new ArrayList<>();

    public List<Character> getRoute() {
        return route;
    }

    public void setRoute(List<Character> route) {
        this.route = route;
    }

    public long getFitness() {
        return fitness;
    }
    
}
