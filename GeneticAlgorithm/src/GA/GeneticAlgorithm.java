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
import java.util.List;

/**
 *
 * @author Asprak-69
 */
public class GeneticAlgorithm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Populasi populasi = new Populasi();
        Algorithm algo = new Algorithm();
        populasi.createPopulasi();
        algo.evolusi(populasi);
    }
    
}
