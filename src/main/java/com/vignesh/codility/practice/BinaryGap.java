package com.vignesh.codility.practice;

public class BinaryGap {
	
	private int solution(int N){
		String binaryString = Integer.toBinaryString(N);
		System.out.println(binaryString);
		int minCount = 0;
		int maxCount =0;
		boolean isOne =false;
		char[] charArray =  binaryString.toCharArray();
		for(char a : charArray){
			if(a == '0'){
				isOne = false;
				minCount++;
			}else if(a == '1'){
				isOne = true;
			}
			if(isOne && minCount>0){
				if(minCount>maxCount){
					maxCount = minCount;
				}
				minCount=0;
			}
		}
		return maxCount;
	}

	public static void main(String[] args) {
		BinaryGap bG = new BinaryGap();
		System.out.println(bG.solution(74901729));

	}

}
