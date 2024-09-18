package org.example;

import com.sun.jdi.Value;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
    }
    public static  <T> Map<T, Integer> mapMethod(T[] array){
        Map<T,Integer> elementCountMap = new HashMap<>();

        for (T element : array){
            elementCountMap.put(element,elementCountMap.getOrDefault(element,0) + 1);

        } return elementCountMap;
    }
}