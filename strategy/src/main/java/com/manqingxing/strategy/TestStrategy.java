package com.manqingxing.strategy;

import com.manqingxing.strategy.impl.OperationAdd;
import com.manqingxing.strategy.impl.OperationMultiply;
import com.manqingxing.strategy.impl.OperationSubstract;

public class TestStrategy {
	public static void main(String[] args) {
		// 创建上下文，并放入算法，以后切换上下文的算法实现即可
		Context context = new Context(new OperationAdd());
		System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

		context = new Context(new OperationSubstract());
		System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

		context = new Context(new OperationMultiply());
		System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
	}
}
