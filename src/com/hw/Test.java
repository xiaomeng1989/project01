package com.hw;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        
        System.out.println("hello");
        System.out.println("args = " + Arrays.deepToString(args));
        System.out.println("Test.main");
        int num = 10;
        System.out.println("num = " + num);
        System.out.println(num);
        ArrayList<String> objects = new ArrayList<>();
        objects.add("a");
        objects.add("b");
        objects.add("c");
        objects.add("c");
        for (String object : objects) {
            
        }

    }
    
}
