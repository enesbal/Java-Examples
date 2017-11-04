package ExceptionExamples;

import java.util.Stack;


public class EmptyStackException {
    public static void main(String[] args) {
        int count = 1000000;
        Stack s = new Stack();
        System.out.println("Testing for empty stack");
        long s1 = System.currentTimeMillis();
        for (int i = 0; i <= count; i++) {
        }
        if (!s.empty()) s.pop();
        long s2 = System.currentTimeMillis();
        System.out.println((s2 - s1) + " miliseconds");
        System.out.println("Catching EmptyStackException");
        s1 = System.currentTimeMillis();

        for (int i = 0; i <= count; i++) {
            try {
                s.pop();
            } catch (java.util.EmptyStackException e) {
            }

        }

        s2 = System.currentTimeMillis();
        System.out.println((s2 - s1) + " miliseconds");
    }
}