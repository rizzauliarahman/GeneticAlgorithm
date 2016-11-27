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
public class Populasi {
    List<Kromosom> populasi = new ArrayList<>();
    
    public void addKromosom(Kromosom kromosom) {
        populasi.add(kromosom);
    }
    
    
}
