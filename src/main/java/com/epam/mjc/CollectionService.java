package com.epam.mjc;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class CollectionService {

    public static void main(String[] args) {
        CollectionService collectionService = new CollectionService();
        System.out.println(collectionService.sum(List.of(2, 0, 18)));

    }

    public List<Integer> filterEvenNumbers(List<Integer> list) {
        return list.stream()
                .filter(e -> e % 2 == 0)
                .collect(Collectors.toList());
    }

    public List<String> toUpperCaseCollection(List<String> list) {
        return list.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }

    //OptionalInt max = list.stream().mapToInt(Integer::intValue).max();
    public Optional<Integer> findMax(List<Integer> list) {
        return list.stream()
                .max(Comparator.comparingInt(a -> a));
    }

    public Optional<Integer> findMin(List<List<Integer>> list) {
        return list.stream()
                .flatMap(Collection::stream)
                .min(Comparator.comparingInt(a -> a));
    }

    public Integer sum(List<Integer> list) {
        return list.stream()
                .reduce(0, Integer::sum);
    }
}
