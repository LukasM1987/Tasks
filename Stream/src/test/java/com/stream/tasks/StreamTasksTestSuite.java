package com.stream.tasks;

import com.stream.tasks.data.Employee;
import com.stream.tasks.data.Person;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.Map;

public class StreamTasksTestSuite {

    @Test
    public void findTheBiggestNumberTest() {
        //Given
        Tasks tasks = new Tasks();

        //When
        int data = tasks.findTheBiggestNumber();
        int result = 9;

        //Then
        Assert.assertEquals(result, data);
    }

    @Test
    public void sumAllNumbersTest() {
        //Given
        Tasks tasks = new Tasks();

        //When
        int data = tasks.sumAllNumbers();
        int result = 36;

        //Then
        Assert.assertEquals(result, data);
    }

    @Test
    public void allEvenNumbersTest() {
        //Given
        Tasks tasks = new Tasks();

        //When
        List<Integer> data = tasks.allEvenNumbers();
        int result = 3;

        //Then
        Assert.assertEquals(result, data.size());
    }

    @Test
    public void getUniqueElementsTest() {
        //Given
        Tasks tasks = new Tasks();

        //When
        List<String> data = tasks.getUniqueElements();
        int resultSize = 4;
        String resultAnimal1 = "kot";
        String resultAnimal2 = "pies";
        String resultAnimal3 = "ptak";
        String resultAnimal4 = "ryba";

        //Then
        Assert.assertEquals(resultSize, data.size());
        Assert.assertEquals(resultAnimal1, data.get(0));
        Assert.assertEquals(resultAnimal2, data.get(1));
        Assert.assertEquals(resultAnimal3, data.get(2));
        Assert.assertEquals(resultAnimal4, data.get(3));
    }

    @Test
    public void getElementsByLengthTest() {
        //Given
        Tasks tasks = new Tasks();

        //When
        List<String> data = tasks.getElementsByLength(6);
        int result = 4;

        //Then
        Assert.assertEquals(result, data.size());
    }

    @Test
    public void getSumOfUniqueNumbersFromListsTest() {
        //Given
        Tasks tasks = new Tasks();

        //When
        int data = tasks.getSumOfUniqueNumbersFromLists();
        int result = 28;

        //Then
        Assert.assertEquals(result, data);
    }

    @Test
    public void mostCommonElemetsTest() {
        //Given
        Tasks tasks = new Tasks();

        //When
        List<String> data = tasks.mostCommonElements();
        int resultSize = 2;
        String firstAnimal = "kot";
        String secondAnimal = "pies";

        //Then
        Assert.assertEquals(resultSize, data.size());
        Assert.assertEquals(firstAnimal, data.get(0));
        Assert.assertEquals(secondAnimal, data.get(1));
    }

    @Test
    public void sumOfSquaresTest() {
        //Given
        Tasks tasks = new Tasks();

        //When
        int data = tasks.sumOfSquares();
        int result = 240;

        //Then
        Assert.assertEquals(result, data);
    }

    @Test
    public void getMedianNumberFromSortedListTest() {
        //Given
        Tasks tasks = new Tasks();

        //When
        int data = tasks.getMedianNumberFromSortedList();
        int result = 5;

        //Then
        Assert.assertEquals(result, data);
    }

    @Test
    public void findTheDifferenceBetweenTheLargestAndSmallestNumberTest() {
        //Given
        Tasks tasks = new Tasks();

        //When
        int data = tasks.findTheDifferenceBetweenTheLargestAndSmallestNumber();
        int result = 8;

        //Then
        Assert.assertEquals(result, data);
    }

    @Test
    public void findPredicateTest() {
        //Given
        Tasks tasks = new Tasks();

        //When
        List<String> data = tasks.findPredicates('k');
        int result = 2;

        //Then
        Assert.assertEquals(result, data.size());
    }

    @Test
    public void calculateAverageTest() {
        //Given
        Tasks tasks = new Tasks();

        //When
        double data = tasks.calculateAverage();
        double result = 5.142;

        //Then
        Assert.assertEquals(result, data, 0.001);
    }

    @Test
    public void removeAllNumbersLessThenTest() {
        //Given
        Tasks tasks = new Tasks();

        //When
        List<Integer> data = tasks.removeAllNumbersLessThen(4);
        int result = 4;

        //Then
        Assert.assertEquals(result, data.size());
    }

    @Test
    public void filterPrimeNumbersTest() {
        //Given
        Tasks tasks = new Tasks();

        //When
        List<Integer> data = tasks.filterPrimeNumbers();
        int result = 3;

        //Then
        Assert.assertEquals(result, data.size());
    }

    @Test
    public void containNumberTest() {
        //Given
        Tasks tasks = new Tasks();

        //When
        Map<String, Long> data = tasks.containNumber();
        int result = 4;
        int cat = 2;
        int fish = 1;
        int dog = 2;

        //Then
        Assert.assertEquals(result, data.size());
        Assert.assertEquals(data.get("kot").longValue(), cat);
        Assert.assertEquals(data.get("ryba").longValue(), fish);
        Assert.assertEquals(data.get("pies").longValue(), dog);
    }

    @Test
    public void getNamesTest() {
        //Given
        Tasks tasks = new Tasks();

        //When
        List<String> data = tasks.getNames('O');
        int resultSize = 2;

        //Then
        Assert.assertEquals(resultSize, data.size());
        Assert.assertEquals("Ola", data.get(0));
        Assert.assertEquals("Ola", data.get(1));
    }

    @Test
    public void toUpperCaseTest() {
        //Given
        Tasks tasks = new Tasks();

        //When
        List<String> data = tasks.toUpperCase();
        int resultSize = 6;
        String apple = "Jablko";

        //Then
        Assert.assertEquals(resultSize, data.size());
        Assert.assertEquals(apple, data.get(0));
    }

    @Test
    public void sortBySurnameTest() {
        //Given
        Tasks tasks = new Tasks();

        //When
        List<Person> data = tasks.sortBySurname();
        int resultSize = 6;
        String firstPersonSurname = "C";

        //Then
        Assert.assertEquals(resultSize, data.size());
        Assert.assertEquals(firstPersonSurname, data.get(0).getSurname());
    }

    @Test
    public void quantityOfEmployeesWithThisSameSurnameTest() {
        //Given
        Tasks tasks = new Tasks();

        //When
        Map<String, List<Employee>> data = tasks.quantityOfEmployeesWithThisSameSurname();
        int resultSize = 3;
        int smithsQuantity = 3;
        int ripsonsQuantity = 2;
        int mcDonaldQuantity = 1;

        //Then
        Assert.assertEquals(resultSize, data.size());
        Assert.assertEquals(smithsQuantity, data.get("Smith").size());
        Assert.assertEquals(ripsonsQuantity, data.get("Ripson").size());
        Assert.assertEquals(mcDonaldQuantity, data.get("McDonald").size());
    }
}
