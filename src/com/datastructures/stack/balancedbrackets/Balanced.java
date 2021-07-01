package com.datastructures.stack.balancedbrackets;

import java.util.List;
import java.util.Stack;

public class Balanced {
    private final String sequence;
    private final IInterpreter interp;

    Balanced(IInterpreter interp, String sequence) {
        this.sequence = sequence;
        this.interp = interp;
    }

    public boolean isBalanced() { return test(interp.read(sequence)); }

    private String[] getProperties(Bracket item) {
        return item.toString().split("_");
    }

    private boolean test(List<Bracket> items) {
        var read = new Stack<Bracket>();

        for (Bracket item:items) {
            var properties = getProperties(item);

            if (properties[0].equals("LEFT")) {
                read.push(item);
            } else if (properties[1].equals(getProperties(read.peek())[1])) {
                read.pop();
            }
        }

        return read.isEmpty();
    }
}
