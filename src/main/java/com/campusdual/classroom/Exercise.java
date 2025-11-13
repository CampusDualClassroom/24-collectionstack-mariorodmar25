package com.campusdual.classroom;

import java.util.Stack;

public class Exercise {
    public static Stack<String> createStack() {
        Stack<String> stack = new Stack<>();
        stack.push("Smith");
        stack.push("Montessori");
        stack.push("Peralta");
        stack.push("House");
        return stack;



    }

    public static void printAndEmptyStack(Stack<String> stack) {
        while (!stack.isEmpty()){
            String pop = stack.pop();
            System.out.println(pop);

        }



    }

    public static void main(String[] args) {
        Stack<String> stack = createStack();
        printAndEmptyStack(stack);

    }



}