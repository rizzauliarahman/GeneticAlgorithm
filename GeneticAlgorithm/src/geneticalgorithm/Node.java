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
 * @author rizzauliarahman
 */
public class Node {
    List<Adjacent> neighbors = new ArrayList<>();
    char label;

    public Node(char label) {
        this.label = label;
    }
    
    public void addNeighbor (Adjacent adj) {
        neighbors.add(adj);
    }
    
    public Adjacent getNeighbor (int index) {
        return neighbors.get(index);
    }
    
}
