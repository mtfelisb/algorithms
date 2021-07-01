package com.datastructures.stack.balancedbrackets;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var isBalanced = new Balanced(readSequence()).isBalanced();
        System.out.println(isBalanced ? "It's balanced :)" : "It's not balanced :(");
    }

    private static String readSequence() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please, insert the sequence: ");

        return userInput.nextLine();
    }
}
