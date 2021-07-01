package com.algorithms.sort.bubblesort;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        var itemsToBeSorted = new ArrayList<Node>();

        itemsToBeSorted.add(new Node(5));
        itemsToBeSorted.add(new Node(2));
        itemsToBeSorted.add(new Node(13));
        itemsToBeSorted.add(new Node(10));
        itemsToBeSorted.add(new Node(3));

        var sortedItems = new BubbleSort(itemsToBeSorted).sort();

        System.out.println(sortedItems.toString());
    }
}
