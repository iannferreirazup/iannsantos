package br.zup.discovery.academy.iannsantos.number1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class PrimeNumbers {
    public static void main(String[] args) {
        List<Integer> keyNumbers = Arrays.asList(2, 3, 5, 7);
        List<Integer> primeNumbers = new ArrayList<>();

        Predicate<Integer> checkIfNumberIsOdd = (number) -> number % 2 != 0;
        Predicate<Integer> checkIfNumberDoNotMultipleOf3 = (number) -> number % 3 != 0;
        Predicate<Integer> checkIfNumberDoNotMultipleOf5 = (number) -> number % 5 != 0;
        Predicate<Integer> checkIfNumberDoNotMultipleOf7 = (number) -> number % 7 != 0;
        BiPredicate<List<Integer>, Integer> checkIfNumberDoNotKeyNumber = List::contains;

        for (int i = 0; i <= 1000; i++) {
            Boolean isNumberKey = checkIfNumberDoNotKeyNumber.test(keyNumbers, i);
            Boolean isPrimeNumber = checkIfNumberIsOdd
                .and(checkIfNumberDoNotMultipleOf3)
                .and(checkIfNumberDoNotMultipleOf5)
                .and(checkIfNumberDoNotMultipleOf7)
                .test(i);


            if (i != 1 && (isNumberKey || isPrimeNumber)) {
                primeNumbers.add(i);
            }
        }

        Stream<Integer> oddPrimeNumbers = primeNumbers.stream()
                .filter(checkIfNumberIsOdd.negate());

        oddPrimeNumbers.forEach(System.out::println);
    }
}
