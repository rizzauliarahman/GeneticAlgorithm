/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graph;

/**
 *
 * @author rizzauliarahman
 */
public class MainGraph {
    AdjacencyList al = new AdjacencyList();
    
    public MainGraph() {
        //Node S
        Node node = new Node('S');
        al.addNode(node);
        node = new Node('A');
        al.addNode(node);
        node = new Node('B');
        al.addNode(node);
        node = new Node('C');
        al.addNode(node);
        node = new Node('D');
        al.addNode(node);
        node = new Node('E');
        al.addNode(node);
        node = new Node('F');
        al.addNode(node);
        node = new Node('G');
        al.addNode(node);
        
        //Node S
        node = al.getNode('S');        
        node.addNeighbor(new Adjacent(al.getNode('A'), 6, 60));
        node.addNeighbor(new Adjacent(al.getNode('B'), 14, 60));
        node.addNeighbor(new Adjacent(al.getNode('C'), 10, 60));
        
        //Node A
        node = al.getNode('A');
        node.addNeighbor(new Adjacent(al.getNode('B'), 4, 40));
        node.addNeighbor(new Adjacent(al.getNode('D'), 16, 40));
        
        //Node B
        node = al.getNode('B');
        node.addNeighbor(new Adjacent(al.getNode('A'), 4, 40));
        node.addNeighbor(new Adjacent(al.getNode('C'), 4, 60));
        node.addNeighbor(new Adjacent(al.getNode('E'), 15, 60));
        
        //Node C
        node = al.getNode('C');
        node.addNeighbor(new Adjacent(al.getNode('B'), 4, 60));
        node.addNeighbor(new Adjacent(al.getNode('F'), 12, 40));
        
        //Node D
        node = al.getNode('D');
        node.addNeighbor(new Adjacent(al.getNode('A'), 16, 40));
        node.addNeighbor(new Adjacent(al.getNode('E'), 4, 60));
        node.addNeighbor(new Adjacent(al.getNode('G'), 9, 60));
        
        //Node E
        node = al.getNode('E');
        node.addNeighbor(new Adjacent(al.getNode('B'), 15, 60));
        node.addNeighbor(new Adjacent(al.getNode('D'), 4, 60));
        node.addNeighbor(new Adjacent(al.getNode('F'), 4, 60));
        node.addNeighbor(new Adjacent(al.getNode('G'), 9, 60));
        
        //Node F
        node = al.getNode('F');
        node.addNeighbor(new Adjacent(al.getNode('C'), 12, 40));
        node.addNeighbor(new Adjacent(al.getNode('E'), 4, 60));
        node.addNeighbor(new Adjacent(al.getNode('G'), 6, 40));
    }
    
    public AdjacencyList getGraph() {
        return al;
    }
}
