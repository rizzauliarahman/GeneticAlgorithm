/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geneticalgorithm;

import Graph.Adjacent;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Asprak-69
 */
public class Kromosom {
    float fitness;
    List<Adjacent> route = new ArrayList<>();
    int label;
    
    public Kromosom(int label) {
        this.label = label;
    }

    public List<Adjacent> getRoute() {
        return route;
    }

    public void setRoute(List<Adjacent> route) {
        this.route = route;
    }
    
    public void setFitness() {
        float total = 0;
        for (Adjacent a : route) {
            total = total + a.getWeight();
        }
        fitness = 1/total;
    }

    public float getFitness() {
        return fitness;
    }
    
}
