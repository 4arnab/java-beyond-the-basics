package com.arnab;

import java.util.ArrayList;
import java.util.List;

public class WorkingWithLists {
    public static void main(String[] args){
        List colors = new ArrayList();
        List<Integer> numbers = new ArrayList<>();
        colors.add(10);
        colors.add("Google");

//        List methods
        System.out.println(colors.contains("blue")); // -> returns false
        System.out.println(colors.size());
        System.out.println(colors);

    }
}
