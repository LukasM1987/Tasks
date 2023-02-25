package com.stream.tasks;

import com.stream.tasks.data.Employee;
import com.stream.tasks.data.Person;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Tasks {

    private static final List<Integer> numbers = Arrays.asList(4, 7, 2, 9, 1, 5, 8);
    private static final List<String> animals = Arrays.asList("kot", "pies", "kot", "ptak", "ryba", "pies");
    private static final List<String> fruits = Arrays.asList("jablko", "banan", "gruszka", "ananas", "kiwi", "pomarancza");
    private static final List<String> names = Arrays.asList("Lukasz", "Igor", "Ola", "Ola", "Ignacy", "Kuba", "Julia");
    private static final List<Person> persons = Arrays.asList(new Person("Lukasz", "M"),
            new Person("Ola", "K"),
            new Person("Igor", "R"),
            new Person("Marcin", "C"),
            new Person("Zaneta", "K"),
            new Person("Julia", "M"));
    private static final List<Employee> employees = Arrays.asList(new Employee("John", "Smith"),
            new Employee("Betty", "Ripson"),
            new Employee("Sam", "Smith"),
            new Employee("Julia", "Ripson"),
            new Employee("Tom", "McDonald"),
            new Employee("Julia", "Smith"));

    public int findTheBiggestNumber() {
        return numbers.stream().mapToInt(Integer::intValue).max().orElse(0);
    }

    public int sumAllNumbers() {
        return numbers.stream().mapToInt(Integer::intValue).sum();
    }

    public List<Integer> allEvenNumbers() {
        return numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
    }

    public List<String> getUniqueElements() {
        return animals.stream().distinct().collect(Collectors.toList());
    }

    public List<String> getElementsByLength(int length) {
        return fruits.stream().filter(f -> f.length() >= length).collect(Collectors.toList());
    }

    public int getSumOfUniqueNumbersFromLists() {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(3, 4, 5, 6, 7);
        return Stream.concat(list1.stream(), list2.stream()).distinct().reduce(0, Integer::sum);
    }

    public List<String> mostCommonElements() {
        Map<String, Long> frequencyMap = animals.stream()
                .collect(Collectors.groupingBy(a -> a, Collectors.counting()));
        long maxFrequency = Collections.max(frequencyMap.values());
        List<String> mostCommon = frequencyMap.entrySet()
                .stream()
                .filter(entry -> entry.getValue() == maxFrequency)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        return mostCommon;
    }

    public int sumOfSquares() {
        return numbers.stream().mapToInt(n -> (int) Math.pow(n, 2.0)).sum();
    }

    public int getMedianNumberFromSortedList() {
        return numbers.stream().sorted().skip(numbers.size() / 2).findFirst().orElse(0);
    }

    public int findTheDifferenceBetweenTheLargestAndSmallestNumber() {
        return numbers.stream().mapToInt(Integer::intValue).max().orElse(0)
                - numbers.stream().mapToInt(Integer::intValue).min().orElse(0);
    }

    public List<String> findPredicates(char sign) {
        return animals.stream().filter(a -> a.startsWith(String.valueOf(sign))).collect(Collectors.toList());
    }

    public double calculateAverage() {
        return numbers.stream().mapToInt(Integer::intValue).average().orElse(0);
    }

    public List<Integer> removeAllNumbersLessThen(int number) {
        return numbers.stream().sorted().filter(n -> n > number).collect(Collectors.toList());
    }

    public List<Integer> filterPrimeNumbers() {
        return numbers.stream().filter(this::isPrime).collect(Collectors.toList());
    }

    private boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public Map<String, Long> containNumber() {
        Map<String, Long> map = animals.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        return map;
    }

    public List<String> getNames(char sign) {
        return names.stream().filter(n -> n.startsWith(String.valueOf(sign))).collect(Collectors.toList());
    }

    public List<String> toUpperCase() {
        return fruits.stream()
                .map(f -> String.valueOf(f.charAt(0)).toUpperCase().concat(f.substring(1, f.length())))
                .collect(Collectors.toList());
    }

    public List<Person> sortBySurname() {
        return persons.stream()
                .sorted(Comparator.comparing(Person::getSurname))
                .collect(Collectors.toList());
    }

    public Map<String, List<Employee>> quantityOfEmployeesWithThisSameSurname() {
        return employees.stream()
                .collect(Collectors.groupingBy(Employee::getSurname));
    }
}
