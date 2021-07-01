package com.datastructures.stack.balancedbrackets;

public enum Bracket {
    LEFT_BRACKET((short)91),
    LEFT_PARENTHESES((short)40),
    LEFT_BRACES((short)123),

    RIGHT_BRACKET((short)93),
    RIGHT_PARENTHESES((short)41),
    RIGHT_BRACES((short)125);

    private final short value;

    Bracket(short value) {
        this.value = value;
    }

    public static Bracket fromShort(short key) {
        for (Bracket bkt:Bracket.values()) {
            if (bkt.value == key) { return bkt; }
        }
        return null;
    }
}
