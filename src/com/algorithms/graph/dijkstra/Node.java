package com.algorithms.graph.dijkstra;

import java.util.ArrayList;

public class Node implements Comparable<Node> {
    private final String name;
    private Node predecessor;
    private int estimate;
    private boolean isOpen;
    private final ArrayList<Edge> adjacencies;

    Node(String name) {
        this.isOpen = false;
        this.name = name;
        this.estimate = Integer.MAX_VALUE;
        this.adjacencies = new ArrayList<>();
    }

    public boolean isOpen() { return isOpen; }

    public void setOpen(boolean open) { isOpen = open; }

    public String getName() { return name; }

    public void setEstimate(int estimate) {
        this.estimate = estimate;
    }

    public int getEstimate() { return estimate; }

    public void setPredecessor(Node predecessor) {
        this.predecessor = predecessor;
    }

    public Node getPredecessor() { return predecessor; }

    public void addAdjacency(Edge adjacency) {
        this.adjacencies.add(adjacency);
    }

    public ArrayList<Edge> getAdjacencies() {
        return adjacencies;
    }

    @Override
    public String toString() {
        return "Node{" +
                "name='" + name + '\'' +
                ", estimate=" + estimate +
                '}';
    }

    @Override
    public int compareTo(Node n) {
        return Integer.compare(n.getEstimate(), estimate);
    }
}
