package com.algorithms.sort.bubblesort;

import java.util.List;

/*
 * BubbleSort impl
 *
 * @author Matheus Felisberto<matheus.felisberto@hotmail.com>
 * @class sorting
 * @complexity Average O(n²)
 */
public class BubbleSort {
    private final List<Node> items;

    BubbleSort(List<Node> items) {
        this.items = items;
    }

    public List<Node> sort() {
        boolean swapped;

        for (int i = 0; i < items.size() - 1; i++) {
            swapped = false;

            for (int j = 0; j < items.size()-i-1; j++) {
                if (items.get(j).getValue() > items.get(j+1).getValue()) {
                    swap(j, j+1);
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }

        return items;
    }

    private void swap(int a, int b) {
        var pivot = items.get(a);
        items.set(a, items.get(b));
        items.set(b, pivot);
    }
}
