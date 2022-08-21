package com.session.lambdaIntro;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Eg02 {
	public static void main(String[] args) {
		final List<BigDecimal> prices = Arrays.asList(new BigDecimal("10"), new BigDecimal("30"), new BigDecimal("17"),
				new BigDecimal("20"), new BigDecimal("15"), new BigDecimal("18"), new BigDecimal("45"),
				new BigDecimal("12"));

		/*
		 * we’re asked to total the prices greater than $20, discounted by 10%. Let’s do
		 * that in the habitual Java way first
		 */

		// Method1:
		BigDecimal totalOfDiscountedPrices = BigDecimal.ZERO;
		for (BigDecimal price : prices) {
			if (price.compareTo(BigDecimal.valueOf(20)) > 0) {
				totalOfDiscountedPrices = totalOfDiscountedPrices.add(price.multiply(BigDecimal.valueOf(0.9)));
			}
		}
		System.out.println("Total of discounted prices: " + totalOfDiscountedPrices);

		// Method 2 Java8
		BigDecimal totalOfDiscountedPrices_method2 = prices.stream()
				.filter(price -> price.compareTo(BigDecimal.valueOf(20)) > 0)
				.map(price -> price.multiply(BigDecimal.valueOf(0.9)))
				.reduce(BigDecimal.ZERO, BigDecimal::add);

		System.out.println(totalOfDiscountedPrices);
		System.out.println(totalOfDiscountedPrices_method2);
	}
}
