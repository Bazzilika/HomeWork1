package com.sjd.homework;

import java.util.HashMap;

public class CountMapGeneric<T> implements CountMap<T> {
    private HashMap<T, Integer> countMap;

    public CountMapGeneric(){
        countMap = new HashMap<>();
    }

    @Override
    public void add(T element) {
        countMap.merge(element, 1, (old, newOne) -> old + 1);
    }

    @Override
    public int getCount(T element) {
        return countMap.getOrDefault(element, 0);
    }

    @Override
    public int remove(T element) {
        if (!countMap.containsKey(element)) {
            return 0;
        }
        int eCount = countMap.get(element);
        countMap.computeIfPresent(element, (el, old) -> old - 1);
        return eCount;
    }

    @Override
    public int size() {
        return countMap.keySet().size();
    }

    @Override
    public HashMap<T, Integer> toMap() {
        if (countMap.isEmpty()){
            return null;
        }
        HashMap<T, Integer> newMap = new HashMap<>(); //todo: hash??
        toMap(newMap);
        return newMap;
    }

    @Override
    public void addAll(CountMap<T> source) {
        if (source.size() < 1){
            return;
        }
        HashMap<T, Integer> sourceMap = source.toMap();
        for (T key: sourceMap.keySet()
             ) {
            //todo: contains -> true??
            this.add(key);
            countMap.put(key, countMap.get(key) + sourceMap.get(key) - 1);
        }
    }

    @Override
    public void toMap(HashMap<T, Integer> destination) {
        if (countMap.isEmpty()){
            return;
        }
        for (T key: countMap.keySet()
        ) {
            destination.put(key, countMap.get(key));
        }
    }
}
