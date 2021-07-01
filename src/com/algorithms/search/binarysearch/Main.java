package com.algorithms.search.binarysearch;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        var items = new ArrayList<Node>();

        items.add(new Node(10));
        items.add(new Node(20));
        items.add(new Node(30));
        items.add(new Node(40));
        items.add(new Node(50));
        items.add(new Node(60));
        items.add(new Node(70));
        items.add(new Node(80));
        items.add(new Node(90));
        items.add(new Node(100));

        var elementIndex = new BinarySearch(items).search(90);

        System.out.println(elementIndex == -1
            ? "Node not found :("
            : "Node found at index " + elementIndex + " :)");
    }
}
