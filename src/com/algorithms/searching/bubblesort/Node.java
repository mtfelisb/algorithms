package com.algorithms.searching.bubblesort;

public class Node {
    private final int value;

    Node(int value) {
        this.value = value;
    }

    public int getValue() { return value; }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                '}';
    }
}
