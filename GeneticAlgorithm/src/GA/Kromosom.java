/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GA;

import Graph.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Asprak-69
 */
public class Kromosom {
    private float fitness;
    List<Adjacent> route = new ArrayList<>();
    Random rand = new Random();

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
    
    public void createRoute(AdjacencyList graph) {
        List<Node> list = graph.getAdjList();
        for (Node n : list) {
            for (int i = 0; i < n.getNeighbors().size(); i++) {
                n.getNeighbor(i).getLabel().unvisit();
            }
            n.unvisit();
        }
        Adjacent adj = new Adjacent(graph.getNode('S'), 0, 0);
        route.add(adj);
        Node node = graph.getNode('S');
        adj = node.getNeighbor(rand.nextInt(node.getNeighbors().size() - 1) + 0);
        adj.getLabel().visit();
        route.add(adj);
        while (!(adj.getLabel() == graph.getNode('G'))) {
            node = adj.getLabel();
            do {
                adj = node.getNeighbor(rand.nextInt(node.getNeighbors().size()) + 0);
            } while (adj.getLabel().getVisited());
            adj.getLabel().visit();
            route.add(adj);
        }
    }
    
}
