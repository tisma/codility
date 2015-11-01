package com.tisma.github.codility.lesson1.permmissingelem;

class Solution {
	
	public long sum(int[] A) {
		long s = 0L;
		for (int i = 0; i < A.length; i++) {
			s += A[i];
		}
		return s;
	}
	
	public int solution(int[] A) {
		int N = A.length + 1;
		long total = N * (N + 1) / 2;
		long currSum = sum(A);
		return (int)(total - currSum);
	}
}

public class PermMissingElem {
	
	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] A = new int[] { 2, 3, 1, 5 };
		System.out.println(solution.solution(A));
	}

}
