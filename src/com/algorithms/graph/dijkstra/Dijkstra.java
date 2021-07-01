package com.algorithms.graph.dijkstra;

import java.util.*;

public class Dijkstra {
    private final ArrayList<Node> graph;

    Dijkstra(ArrayList<Node> graph) {
        this.graph = graph;
    }

    public void find() {
        graph.get(0).setEstimate(0);

        PriorityQueue<Node> queue = new PriorityQueue<>();
        queue.add(graph.get(0));

        while (!queue.isEmpty()) {
            Node minimum = queue.poll();

            minimum.getAdjacencies().forEach(edge -> {
                queue.add(edge.getNode());
                calculateDistance(minimum, edge.getNode(), edge.getWeight());
            });
        }
    }

    private void calculateDistance(Node u, Node v, int weight) {
        if ((u.getEstimate() + weight) < v.getEstimate()) {
            v.setEstimate(u.getEstimate() + weight);
            v.setPredecessor(u);
        }
    }

    public List<Node> shortestPathTo(Node target) {
        List<Node> path = new ArrayList<>();

        while (target.getPredecessor() != null) {
            target = target.getPredecessor();
            path.add(0, target);
        }

        return path;
    }
}
