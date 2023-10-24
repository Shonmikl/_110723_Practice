package org.example._2023_10_24;

import java.util.ArrayList;
import java.util.List;

public class PalVer2 {
    public static void main(String[] args) {
        String text = "MADDAM";
        List<Character> list = new ArrayList<>();

        for (char c : text.toCharArray()) {
            list.add(c);
        }

        int start = 0;
        int end = list.size() - 1;
        boolean isPalindrome = true;
        //VF
        while (start < end) {
            if (list.get(start) == list.get(end)) {
                start++;
                end--;
            } else {
                isPalindrome = false;
                break;
            }
        }
        System.out.println(isPalindrome);
    }
}