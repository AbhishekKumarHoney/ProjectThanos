package com.honey.test;

import java.util.Arrays;
import java.util.function.IntPredicate;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {

		DoubleStream stream = Stream.iterate(1, n -> n + 1)
									.filter(Test::isPrime)
									.mapToDouble(Math::sqrt)
									.limit(10);
		System.out.println(stream);

		double[] arr = stream.toArray();

		System.out.println("fsdflslfjs");
		System.out.println(Arrays.toString(arr));
	}

	public static boolean isPrime(int i) {
		IntPredicate isDivisible = index -> i % index == 0;
		return i > 1 && IntStream	.range(2, i)
									.noneMatch(isDivisible);
	}

}
