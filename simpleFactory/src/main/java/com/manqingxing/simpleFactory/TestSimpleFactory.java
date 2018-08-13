package com.manqingxing.simpleFactory;

import com.manqingxing.simpleFactory.enums.ShapeType;

public class TestSimpleFactory {

	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();

		// 获取 Circle 的对象，并调用它的 draw 方法
		Shape circle = shapeFactory.getShape(ShapeType.CIRCLE);
		circle.draw();

		Shape rectangle = shapeFactory.getShape(ShapeType.RECTANGLE);
		rectangle.draw();

		Shape square = shapeFactory.getShape(ShapeType.SQUARE);
		square.draw();
	}
}