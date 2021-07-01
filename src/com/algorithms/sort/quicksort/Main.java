package com.algorithms.sort.quicksort;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        var list = new ArrayList<Node>();

        list.add(new Node(9));
        list.add(new Node(7));
        list.add(new Node(5));
        list.add(new Node(11));
        list.add(new Node(12));
        list.add(new Node(2));
        list.add(new Node(14));
        list.add(new Node(3));
        list.add(new Node(10));
        list.add(new Node(6));

        System.out.println(new QuickSort(list).sort().toString());
    }
}
