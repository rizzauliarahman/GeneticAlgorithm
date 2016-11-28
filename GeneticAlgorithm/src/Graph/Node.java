/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graph;

import Graph.Adjacent;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rizzauliarahman
 */
public class Node {
    List<Adjacent> neighbors = new ArrayList<>();
    private char label;
    private boolean visited = false;

    public Node(char label) {
        this.label = label;
    }
    
    public char getLabel() {
        return label;
    }
    
    public void addNeighbor (Adjacent adj) {
        neighbors.add(adj);
    }
    
    public Adjacent getNeighbor (int index) {
        return neighbors.get(index);
    }
    
    public List<Adjacent> getNeighbors() {
        return neighbors;
    }
    
    public void visit() {
        visited  = true;
    }
    
    public void unvisit() {
        visited = false;
    }
    
    public boolean getVisited() {
        return visited;
    }
    
    public Adjacent getAdjacent (char label) {
        return neighbors.stream().filter(o -> label == o.getLabel().getLabel())
                .findFirst().orElse(null);
    }
    
}
