package com.algorithms.tasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Tasks {

    public List<List<String>> removeDuplicatedAuthorAndHisBook() {
        String[] authors = {"Parker",
                "Parker",
                "King",
                "Homer",
                "Hemingway",
                "Goethe",
                "Homer"};
        String[] books = {"Devices and Desires ",
                "Evil for Evil ",
                "The Dark Tower ",
                "Odyssey",
                "For whom the Bell Tolls",
                "Faust",
                "Illiad"};
        List<String> authorsList = new ArrayList<>();
        List<String> booksList = new ArrayList<>();
        for (int i = 0; i < authors.length; i++) {
            if (authorsList.isEmpty()) {
                authorsList.add(authors[i]);
                booksList.add(books[i]);
            }
            if (!authorsList.contains(authors[i])) {
                authorsList.add(authors[i]);
                booksList.add(books[i]);
            }
        }
        for (String author : authorsList) {
            System.out.println(author);
        }
        for (String book : booksList) {
            System.out.println(book);
        }
        List<List<String>> list = new ArrayList<>();
        list.add(authorsList);
        list.add(booksList);
        return list;
    }

    public int highestNumber(int[] numbers) {
        List<Integer> numbersList = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            numbersList.add(numbers[i]);
        }
        Collections.sort(numbersList);
        return numbersList.get(numbersList.size() - 1);
    }

    public int[] reverseArray(int[] array) {
        int[] reverse = new int[array.length];
        int reverseCounter = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            if (reverseCounter < array.length) {
                reverse[reverseCounter] = array[i];
            }
            reverseCounter++;
        }
        return reverse;
    }

    public int[] sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temporary = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temporary;
                }
            }
        }
        return array;
    }

    public int sum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum;
    }

    public int getMedian(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temporary = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temporary;
                }
            }
        }
        if (array.length % 2 == 0) {
            return array[array.length / 2 - 1];
        }
        return array[array.length / 2];
    }

    public int getSmallestNumber(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temporary = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temporary;
                }
            }
        }
        return array[0];
    }

    public List<Integer> primeNumbers(int range) {
        List<Integer> primers = new ArrayList<>();
        boolean[] isComposite = new boolean[range + 1];
        for (int i = 2; i <= Math.sqrt(range); i++) {
            if (!isComposite[i]) {
                for (int j = i * i; j <= range; j += i) {
                    isComposite[j] = true;
                }
            }
        }
        for (int i = 2; i <= range; i++) {
            if (!isComposite[i]) {
                primers.add(i);
            }
        }
        return primers;
    }

    public boolean isPrimeNumber(int number) {
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

    public int fibonacci(int range) {
        if (range <= 1) {
            return range;
        }
        int a = 0;
        int b = 1;
        for (int i = 2; i <= range; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }

    public boolean isAnagram(String firstWord, String secondWord) {
        List<Character> firsChars = new ArrayList<>();
        List<Character> secondChars= new ArrayList<>();
        if (firstWord.length() != secondWord.length()) {
            return false;
        }
        for (int i = 0; i < firstWord.length(); i++) {
            firsChars.add(firstWord.charAt(i));
            secondChars.add(secondWord.charAt(i));
        }
        Collections.sort(firsChars);
        Collections.sort(secondChars);
        String newFirstWord = "";
        String newSecondWord = "";
        for (int i = 0; i < firsChars.size(); i++) {
            newFirstWord = newFirstWord + firsChars.get(i);
            newSecondWord = newSecondWord + secondChars.get(i);
        }
        if (!newFirstWord.equals(newSecondWord)) {
            return false;
        }
        return true;
    }
}
