package com.sparta.spring_prepare.cicd;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {
	@Test
	void CalculatorTest() {
		Calculator calculator = new Calculator();
		Assertions.assertThat(5).isEqualTo(calculator.add(2, 3));
	}
}