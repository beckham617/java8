package java8exercise.com.liang.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import org.junit.Test;

public class Java8TesterIKM {
	
	@Test
	public void test () {
		/*
		//forEach/limit/sorted
		Random random = new Random();
		random.ints().limit(10).sorted().forEach(System.out::println);
		
		//map
		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
		//get list of unique squares
		List<Integer> squaresList = numbers.stream().map( i -> i*i+i).distinct().collect(Collectors.toList());
		System.out.println(squaresList);
		
		*/
		//filter
		List<String>strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
		//get count of empty string
		long count = strings.stream().filter(string -> string.isEmpty()).count();
		long count1 = strings.parallelStream().filter(string -> string.isEmpty()).count();
		System.out.println(count1);
		
		
	}
	

}
