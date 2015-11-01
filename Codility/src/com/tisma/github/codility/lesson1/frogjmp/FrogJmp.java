package com.tisma.github.codility.lesson1.frogjmp;

class Solution {
	public int solution(int X, int Y, int D) {
		if (X <= 0 || Y <= 0 || D <= 0) {
			return -1;
		}
		int numJmp = 0;
		while (X < Y) {
			X += D;
			numJmp++;
		}
		return numJmp;
	}
	
	public int solution2(int X, int Y, int D) {
		if (X <= 0 || Y <= 0 || D <= 0) {
			return -1;
		}
		return (int)Math.round((Y - X) / (double)D);
	}
}

public class FrogJmp {

	public static void main(String[] args) {
		Solution solution = new Solution();
		int X = 10, Y = 85, D = 30;
		System.out.println(solution.solution2(X, Y, D));
	}

}
