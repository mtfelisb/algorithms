package com.algorithms.graph.dijkstra;

import java.util.*;

public class DijkstraNaive {
    private final ArrayList<Node> graph;

    DijkstraNaive(ArrayList<Node> graph) {
        this.graph = graph;
    }

    public void find() {
        graph.get(0).setEstimate(0);

        while (hasOpenNodes()) {
            Node minimum = graph
                    .stream()
                    .sorted(Comparator.comparingInt(Node::getEstimate))
                    .filter(Node::isOpen).findFirst().orElseThrow();

            minimum.setOpen(true);
            minimum.getAdjacencies().forEach(edge -> calculateEstimate(minimum, edge));
        }
    }

    public ArrayList<Node> getGraph() { return graph; }

    private void calculateEstimate(Node u, Edge v) {
        if ((u.getEstimate() + v.getWeight()) < v.getNode().getEstimate()) {
            v.getNode().setEstimate(u.getEstimate() + v.getWeight());
            v.getNode().setPredecessor(u);
        }
    }

    private boolean hasOpenNodes() {
        return graph.stream().anyMatch(Node::isOpen);
    }
}
