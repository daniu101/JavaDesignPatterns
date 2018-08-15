package com.manqingxing.strategy.impl;

import com.manqingxing.strategy.Strategy;

public class OperationSubstract implements Strategy{
	public int doOperation(int num1, int num2) {
		return num1 - num2;
	}
}