package com.algorithms.searching.quicksort;

import java.util.List;

public class QuickSort {
    private final List<Node> items;

    QuickSort(List<Node> items) {
        this.items = items;
    }

    public List<Node> getItems() {
        return items;
    }

    public List<Node> sort() {
        sort(0, items.size() - 1);
        return items;
    }

    private void sort(int from, int to) {
        if (from < to) {
            var half = partitioning(from, to);
            sort(from, half - 1);
            sort(half + 1, to);
        }
    }

    private int partitioning(int from, int to) {
        var pivot = items.get(to);
        var i = from - 1;

        for (var j = from; j < to; j++) {
            if (items.get(j).getValue() < pivot.getValue()) {
                i++;
                swap(i, j);
            }
        }

        swap(to, ++i);
        return i;
    }

    private void swap(int a, int b) {
        var pivot = items.get(a);
        items.set(a, items.get(b));
        items.set(b, pivot);
    }
}
