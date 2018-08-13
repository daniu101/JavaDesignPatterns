package com.manqingxing.simpleFactory;

import com.manqingxing.simpleFactory.enums.ShapeType;
import com.manqingxing.simpleFactory.impl.Circle;
import com.manqingxing.simpleFactory.impl.Rectangle;
import com.manqingxing.simpleFactory.impl.Square;

public class ShapeFactory {

	// 使用 getShape 方法获取形状类型的对象
	public Shape getShape(ShapeType shapeType) {

		if (shapeType == null) {
			return null;
		}

		switch (shapeType) {
		case CIRCLE:
			return new Circle();
		case RECTANGLE:
			return new Rectangle();
		case SQUARE:
			return new Square();
		default:
			return null;
		}

	}
}