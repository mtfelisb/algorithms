package com.algorithms.graph.dijkstra;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Node Zero = new Node("Zero");
        Node One = new Node("One");
        Node Two = new Node("Two");
        Node Three = new Node("Three");
        Node Foor = new Node("Foor");
        Node Five = new Node("Five");

        Zero.addAdjacency(new Edge(One, 10));
        Zero.addAdjacency(new Edge(Two, 5));

        Two.addAdjacency(new Edge(Three, 8));
        Two.addAdjacency(new Edge(One, 3));
        Two.addAdjacency(new Edge(Foor, 2));

        Three.addAdjacency(new Edge(Foor, 4));
        Three.addAdjacency(new Edge(Five, 4));

        Foor.addAdjacency(new Edge(Five, 6));

        One.addAdjacency(new Edge(Three, 1));

        var dijkstra = new Dijkstra(new ArrayList<>(Arrays.asList(Zero, One, Two, Three, Foor, Five)));
        dijkstra.find();

        System.out.println(dijkstra.shortestPathTo(Three).toString());
    }
}
