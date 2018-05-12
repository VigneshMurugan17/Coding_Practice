package com.vignesh.codility.practice;

import java.util.Arrays;
import java.util.HashSet;

public class SmallestPositiveInteger {
	
	private int  solution(int[] A){
		int returnValue = 1;
		Arrays.sort(A);
		HashSet<Integer> dummySet =  new HashSet<Integer>();
		for(int i : A){
			dummySet.add(i);
		}
		while(dummySet.contains(returnValue)){
			returnValue++;
		}
		return returnValue;
	}

	public static void main(String[] args) {
		int[] integers =  {-1,4,3,2,5};
		SmallestPositiveInteger spi = new SmallestPositiveInteger();
		int smallestPositiveInteger = spi.solution(integers);
		System.out.println(smallestPositiveInteger);

	}

}
