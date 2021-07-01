package com.algorithms.search.binarysearch;

import java.util.List;

public class BinarySearch {
    private final List<Node> items;

    BinarySearch(List<Node> items) {
        this.items = items;
    }

    public int search(int target) { return search(target, 0, items); }

    private int search(int target, int accumulator, List<Node> items) {
        var halfIndex = items.size() >> 1;
        accumulator += halfIndex;

        if (target == items.get(halfIndex).getValue()) {
            return accumulator;
        }

        if (items.size() == 1) {
            return -1;
        }

        return (target < items.get(halfIndex).getValue())
            ? search(target, accumulator, items.subList(0, halfIndex))
            : search(target, accumulator, items.subList(halfIndex, items.size()));
    }
}
