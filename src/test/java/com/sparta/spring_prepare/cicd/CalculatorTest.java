package com.sparta.spring_prepare.cicd;

import static org.junit.jupiter.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {
	@Test
	void CalculatorTest() {
		Calculator calculator = new Calculator();
		Assertions.assertThat(3)
			.isEqualTo(calculator.add(1, 1));
	}

}