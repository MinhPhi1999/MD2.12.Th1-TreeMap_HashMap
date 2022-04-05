package com.codegym;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main{

    public static void main(String[] args) {
	// write your code here

    Map<String, Integer> hashMap = new HashMap<>();
    hashMap.put("Minh",23);
    hashMap.put("Long",22);
    hashMap.put("Hùng",29);
        System.out.println("Display entries in HashMap");
        System.out.println(hashMap);

    Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Display entries in ascending order of key");
        System.out.println(treeMap);

    Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
    linkedHashMap.put("Minh",23);
    linkedHashMap.put("Long",22);
    linkedHashMap.put("Hùng",29);
        System.out.println("\nThe age for "+" Long is " + linkedHashMap.get("Long"));
    }
}