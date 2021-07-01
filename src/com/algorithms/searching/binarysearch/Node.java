package com.algorithms.searching.binarysearch;

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
