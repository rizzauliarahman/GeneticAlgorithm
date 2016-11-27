/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GA;

import Graph.AdjacencyList;
import Graph.Adjacent;
import Graph.MainGraph;
import Graph.Node;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Asprak-69
 */
public class Populasi {
    List<Kromosom> populasi;
    MainGraph mg;
    AdjacencyList al;
    List<Node> graph;
    
    public Populasi () {
        populasi = new ArrayList<>();
        mg = new MainGraph();
        al = mg.getGraph();
        graph = al.getAdjList();
    }
    
    public void showPopulasi() {
        for (Kromosom k : populasi) {
            List<Adjacent> route = k.getRoute();
            for (Adjacent a : route) {
                System.out.print(a.getLabel().getLabel() + " ");
            }
            System.out.print(k.getFitness());
            System.out.println("");
        }
    }
    
    public void createPopulasi() {
        Kromosom k;
        List<Adjacent> route;
        
        for (int i = 0; i < 10; i++) {
            boolean found = false;
            do {
                k = new Kromosom();
                k.createRoute(al);
                boolean[] listFound = new boolean[populasi.size()];
                int count = 0;
                for (Kromosom a : populasi) {
                    found = true;
                    List<Adjacent> route1 = a.getRoute();
                    List<Adjacent> route2 = k.getRoute();
                    int iter = Integer.min(route1.size(), route2.size());
                    int x = 0;
                    while ((x < iter) && (found)) {
                        if ((route1.get(x).getLabel().getLabel() != route2.get(x).getLabel().getLabel())) {
                            found = false;
                        }
                        x++;
                    }
                    listFound[count] = found;
                    count++;
                }
                found = false;
                for (boolean b : listFound) {
                    found = found || b;
                }
            } while (found);
            k.setFitness();
            populasi.add(k);
        }
    }
    
    public List<Kromosom> getPopulasi() {
        return populasi;
    }
    
    public Kromosom getFittest () {
        Kromosom fittest = new Kromosom();
        float maxFitness = -1;
        for (Kromosom k : populasi) {
            if (k.getFitness() > maxFitness) {
                fittest = k;
            }
        }
        return fittest;
    }   
    
    public float getTotalFitness () {
        float total = 0;
        for (Kromosom k : populasi) {
            total = total + k.getFitness();
        }
        return total;
    }
    
}
