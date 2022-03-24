package ch.fhnw.oop.lambdas;

import java.util.List;

public class S50_Sum {
	
	public static void main(String[] args) {
		List<Integer> intList = List.of(1,1,2,3,5,8,13);
		System.out.println(sum1(intList));
		System.out.println(sum2(intList));
	}

	private static int sum1(List<Integer> intList) {
		int sum = 0;
//		intList.forEach(x -> sum = sum + x);
		return sum;
	}

	private static int sum2(List<Integer> intList) {
		final int[] sum = new int[1];
		intList.forEach(x -> sum[0] = sum[0] + x);
		return sum[0];
	}

}
