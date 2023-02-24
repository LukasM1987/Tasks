package com.algorithms.tasks;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class TaskTestSuite {

    @Test
    public void removeDuplicatedAuthorAndHisBookTest() {
        //Given
        Tasks tasks = new Tasks();

        //When
        List<List<String>> list = tasks.removeDuplicatedAuthorAndHisBook();
        int listSize = 2;
        int authorsListSize = 5;
        int booksAuthorSize = 5;

        //Then
        Assert.assertEquals(listSize, list.size());
        Assert.assertEquals(authorsListSize, list.get(0).size());
        Assert.assertEquals(booksAuthorSize, list.get(1).size());
    }

    @Test
    public void highestNumberTest() {
        //Given
        Tasks tasks = new Tasks();
        int[] array = {1,4,6,8,9,3,23,5,34,2,5,6,4,2,1,5,7,8,43,766,23};

        //When
        int data = tasks.highestNumber(array);
        int result = 766;

        //Then
        Assert.assertEquals(result, data);

    }

    @Test
    public void reverseArrayTest() {
        //Given
        Tasks tasks = new Tasks();
        int[] array = {1,2,3,4,5,6,7,8,9};

        //When
        int[] data = tasks.reverseArray(array);
        int result = 9;

        //Then
        Assert.assertEquals(result, data[0]);
    }

    @Test
    public void sortTest() {
        //Given
        Tasks tasks = new Tasks();
        int[] array = {3,5,7,8,4,9,1,6,2};

        //When
        int[] data = tasks.sort(array);
        int result = 9;

        //Then
        Assert.assertEquals(result, data[8]);
    }

    @Test
    public void sumTest() {
        //Given
        Tasks tasks = new Tasks();
        int[] array = {1,2,3,4,5,6,7,8,9};

        //When
        int data = tasks.sum(array);
        int result = 45;

        //Then
        Assert.assertEquals(result, data);
    }

    @Test
    public void getMedianTest() {
        //Given
        Tasks tasks = new Tasks();
        int[] array = {3,5,7,8,4,9,1,6,2};

        //When
        int data = tasks.getMedian(array);
        int result = 5;

        //Then
        Assert.assertEquals(result, data);
    }

    @Test
    public void getSmallestNumberTest() {
        //Given
        Tasks tasks = new Tasks();
        int[] array = {3,5,7,8,4,9,1,6,2};

        //When
        int data = tasks.getSmallestNumber(array);
        int result = 1;

        //Then
        Assert.assertEquals(result, data);
    }

    @Test
    public void primeNumbersTest() {
        //Given
        Tasks tasks = new Tasks();

        //When
        List<Integer> data = tasks.primeNumbers(9);
        int result = 4;

        //Then
        Assert.assertEquals(result, data.size());
    }

    @Test
    public void isPrimeNumbersTest() {
        //Given
        Tasks tasks = new Tasks();

        //When
        boolean data = tasks.isPrimeNumber(9);

        //Then
        Assert.assertFalse(data);
    }

    @Test
    public void fibonacciTestSuite() {
        //Given
        Tasks tasks = new Tasks();

        //When
        int data = tasks.fibonacci(6);
        int result = 8;

        //Then
        Assert.assertEquals(result, data);
    }

    @Test
    public void isAnagramTest() {
        //Given
        Tasks tasks = new Tasks();

        //When
        String firstWord = "kot";
        String secondWord = "tok";
        boolean firstResult = tasks.isAnagram(firstWord, secondWord);
        String thirdWord = "batman";
        String fourthWord = "tok";
        boolean secondResult = tasks.isAnagram(thirdWord, fourthWord);
        String fifthWord = "bat";
        String sixthWord = "tok";
        boolean thirdResult = tasks.isAnagram(fifthWord, sixthWord);

        //Then
        Assert.assertTrue(firstResult);
        Assert.assertFalse(secondResult);
        Assert.assertFalse(thirdResult);
    }
}
