package com.vignesh.codility.practice;

public class RotateArray {

	public int[] solution(int[] A, int K) {
		for (int i = 0; i < K; i++) {

			for (int j = A.length - 1; j > 0; j--) {
				int temp = A[j];
				A[j] = A[j - 1];
				A[j - 1] = temp;

			}

		}
		return A;
	}

	public static void main(String[] args) {
		RotateArray rA = new RotateArray();
		int[] A = { 1, 2, 5, 6, 7 };
		int[] b= rA.solution(A, 3);
		
		for(int i: b){
			System.out.println(i);
		}
	}
}
