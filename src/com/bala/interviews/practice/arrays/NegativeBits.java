package com.bala.interviews.practice.arrays;

import java.util.Arrays;

public class NegativeBits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Integer.toString(9, 2));
		NegativeBits nb = new NegativeBits();
		int[] solution = nb.solution(new int[] {1,0, 0,1,1});
		System.out.println(Arrays.toString(solution));
	}
	public int[] solution(int[] a) {
		long sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i]*Math.pow(-2, i);
		}
		System.out.println(sum);
		return new int[]{};
	}

}
