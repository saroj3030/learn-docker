package com.saroj.learn.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class StreamTest {

	public static void main(String[] args) {
		
		List<Integer> data = Arrays.asList(1,50,20,30,2,5,7,18,45,60);
		System.out.println("Initial Data : " + data);
		
		data = data.stream().filter(d -> d > 10).sorted().collect(Collectors.toList());
		System.out.println("after Data : " + data);

	}

}
