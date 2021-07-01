package com.algorithms.graph.dijkstra;

public class Edge {
    private final int weight;
    private final Node node;

    Edge(Node node, int weight) {
        this.weight = weight;
        this.node = node;
    }

    public int getWeight() {
        return weight;
    }

    public Node getNode() {
        return node;
    }
}
