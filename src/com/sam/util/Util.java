package com.sam.util;

import java.util.Arrays;
import java.util.List;

public class Util {
	
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("4", "4", "6", "6", "2", "2", "2", "2", "2", "2", "10", "10", "4", "4", "4");
		
		Integer sum = list.stream().mapToInt(num ->Integer.parseInt(num)).sum();
		
		Integer max = list.stream().mapToInt(num ->Integer.parseInt(num)).max().orElse(0);
		
		System.out.println(sum);
		
		System.out.println(max);
		
	}

}
