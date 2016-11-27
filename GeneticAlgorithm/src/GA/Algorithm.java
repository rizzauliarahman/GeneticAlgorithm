/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GA;

import Graph.Adjacent;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author rizzauliarahman
 */
public class Algorithm {
    Random r = new Random();
    private int tournamentSize = 3;
    private int sel;
    private double crossoverRate = 0.99;
    private double mutationRate = 0.01;
    
    public Kromosom tournament(Populasi pop) {
        Populasi tmp = new Populasi();
        int numOut = -1;
        int rand;
        for (int i = 0; i < tournamentSize; i++) {
            do {
                rand = r.nextInt(pop.getPopulasi().size()) + 0;
            } while (rand == numOut);
            tmp.getPopulasi().add(pop.getPopulasi().get(rand));
            numOut = rand;
        }
        return tmp.getFittest();
    }
    
    public Kromosom roulette(Populasi pop) {
        float s = pop.getTotalFitness();
        s = s * r.nextFloat();
        float p = 0;
        int x = 0;
        while ((p < s) && (x < pop.getPopulasi().size())) {
            p += pop.getPopulasi().get(x).getFitness();
            x++;
        }
        if (x == 0) {
            return pop.getPopulasi().get(x);
        } else {
            return pop.getPopulasi().get(x-1);
        }
    }
    
    public List<Kromosom> crossover(Populasi pop) {
        List<Kromosom> child = new ArrayList<>();
        List<Integer> indeks = new ArrayList<>();
        sel = r.nextInt(2);
        Kromosom p1 = new Kromosom();
        Kromosom p2 = new Kromosom();
        
        if (sel == 0) {
            do {
                p1 = tournament(pop);
                p2 = tournament(pop);
            } while (p1.equals(p2));
        } else if (sel == 1) {
            do {
                p1 = roulette(pop);
                p2 = roulette(pop);
            } while (p1.equals(p2));
        }
        
        int size1 = p1.getRoute().size();
        int size2 = p2.getRoute().size();
        
        int iter = Integer.min(size1, size2);
        for (int i = 2; i < iter; i++) {
            if (p1.getRoute().get(i).getLabel().getLabel() == p2.getRoute().get(i).getLabel().getLabel()) {
                indeks.add(i);
            }
        }
        if (indeks.size() > 0) {
            int point = indeks.get(r.nextInt(indeks.size()) + 0);
            List<Adjacent> temp = p1.getRoute().subList(0, point);
            for (int i = 0; i < point; i++) {
                p1.getRoute().set(i, p2.getRoute().get(i));
            }
            for (int i = 0; i < point; i++) {
                p2.getRoute().set(i, temp.get(i));
            }
        }
        child.add(p1);
        child.add(p2);
        return child;
    }
}
