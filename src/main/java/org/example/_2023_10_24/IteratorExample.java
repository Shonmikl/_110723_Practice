package org.example._2023_10_24;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class IteratorExample {
    public static void main(String[] args) {
        String text = "MADAM";
        List<Character> list = new ArrayList<>();

        for (char c : text.toCharArray()) {
            list.add(c);
        }

        ListIterator<Character> forward = list.listIterator();
        ListIterator<Character> backward = list.listIterator(list.size());

        boolean isPalindrome = true;
        int s = 0;
        int e = list.size()-1;

        while (forward.hasNext() && backward.hasPrevious() && (s < e)) {
            char f = forward.next();
            char b = backward.previous();
            s++;
            e--;

            if (f != b) {
                isPalindrome = false;
                break;
            }
        }


        System.out.println(isPalindrome);
    }
}