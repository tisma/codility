package com.tisma.github.codility.lesson1.tapeequilibrium;

class Solution {
	
	public int min(int[] A) {
		if (A == null) {
			return -1;
		}
		int min = A[0];
		for (int i = 1; i < A.length; i++) {
			if (A[i] < min) {
				min = A[i];
			}
		}
		return min;
	}
	
	public int sum(int[] A, int i, int j) {
		if (A == null) {
			return -1;
		}
		if (i < 0 || j < 0 || i > A.length || j > A.length) {
			return -1;
		}
		int s = 0;
		for (int x = i; x < j; x++) {
			s += A[x];
		}
		return s;
	}
	
	public int solution(int[] A) {
		if (A == null) {
			return -1;
		}
		int[] P = new int[A.length - 1];
		for (int i = 0; i < P.length; i++) {
			P[i] = Math.abs(sum(A, 0, i + 1) - sum(A, i + 1, A.length));
			System.out.println("P[" + i + "]=" + P[i]);
		}
		return min(P);
	}
	
	public int solution2(int[] A) {
		if (A == null) {
			return -1;
		}
		int[] P = new int[A.length - 1];
		int sum1, sum2 = 0;
		int val, localMin;
		
		sum1 = A[0];
		for (int i = 1; i < A.length; i++) {
			sum2 += A[i];
		}
		
		val = Math.abs(sum2 - sum1);
		
		for (int j = 1; j < A.length; j++) {
			localMin = Math.abs(sum2 - sum1);
			if (localMin < val) {
				val = localMin;
			}
			sum1 += A[j];
			sum2 -= A[j];
			P[j - 1] = localMin;
		}
		
		return min(P);
	}
}

public class TapeEquilibrium {

	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] A = new int[] { 3, 1, 2, 4, 3 };
		System.out.println(solution.solution2(A));
	}

}
