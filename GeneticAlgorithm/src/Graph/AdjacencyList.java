/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graph;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rizzauliarahman
 */
public class AdjacencyList {
    List<Node> graph = new ArrayList<>();
    
    public void addNode (Node node) {
        graph.add(node);
    }
    
    public Node getNode (char label) {
        return graph.stream().filter(o -> (o.getLabel() == label))
                .findFirst().orElse(null);
    }
    
    public List<Node> getAdjList() {
        return graph;
    }
}
