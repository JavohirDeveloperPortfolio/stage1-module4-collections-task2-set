package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> set = new HashSet<>();
        for (Integer integer : sourceList) {
            if (integer % 2 == 1){
                set.add(integer);
                set.add(2*integer);
            }else {
                while(integer != 1){
                    set.add(integer);
                    integer = integer / 2;
                }
                set.add(integer);
            }
        }
        return set;
    }
}
