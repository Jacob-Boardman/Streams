package com.qa.Streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;


public class App 
{
    public static void main( String[] args )
    {
    	int[] anArray = {2,1,5,8,5,3,12,4};
    	List<Integer> aList = new ArrayList<>();
    	
    	System.out.println("This is the List: ");
    	GetEveryValue(anArray, aList);
    	aList.stream().forEach(System.out::println);
    	
    	System.out.println("These are even: ");
    	GetEveryEven(aList).stream().forEach(System.out::println);
    	
    	System.out.println("These are odd: ");
    	GetEveryOdd(aList).stream().forEach(System.out::println);
    	
    	System.out.println("This is the minimum value: "+ GetMinNum(aList));
    	System.out.println("This is the minimum value: "+ GetMaxNum(aList));
    	
    	System.out.println("The List multiplied by 5: ");
    	MultiplyByFive(aList).stream().forEach(System.out::println);
    	
    	    	
    }
        
    public static List<Integer> GetEveryValue(int[] intArray, List<Integer> intList)
    {    	
    	for(int i : intArray)
    	{
    		intList.add(i);
    	}
    	
    	return intList;
    }
    
    public static List<Integer> GetEveryEven(List<Integer> intList)
    { 	
    	return intList.stream().filter(number -> number%2 == 0).collect(Collectors.toList()); 
    }
    
    public static List<Integer> GetEveryOdd(List<Integer> intList)
    {        	
    	return intList.stream().filter(number -> number%2 > 0).collect(Collectors.toList());
    }
    
    public static Integer GetMinNum(List<Integer> intList)
    {
    	return intList.stream().reduce((x, y) -> Integer.min(x, y)).get();
    }
    
    public static Integer GetMaxNum(List<Integer> intList)
    {
    	return intList.stream().reduce((x, y) -> Integer.max(x, y)).get();
    }
    
    public static List<Integer> MultiplyByFive(List<Integer> intList)
    {
    	return intList.stream().map(number -> number*5).collect(Collectors.toList());
    }
    
    public static List<Integer> MakeNewList(List<Integer> intList)
    {
    	return intList;
    }
}
