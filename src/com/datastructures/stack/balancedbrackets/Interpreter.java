package com.datastructures.stack.balancedbrackets;

import java.util.ArrayList;

public class Interpreter implements IInterpreter {
    public ArrayList<Bracket> read(String sequence) {
        ArrayList<Bracket> chars = new ArrayList<>();
        sequence.chars().forEach(i -> chars.add(Bracket.fromShort((short)i)));
        return chars;
    }
}
