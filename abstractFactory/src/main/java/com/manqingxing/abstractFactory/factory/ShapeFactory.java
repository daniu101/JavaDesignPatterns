package com.manqingxing.abstractFactory.factory;

import com.manqingxing.abstractFactory.Color;
import com.manqingxing.abstractFactory.Shape;
import com.manqingxing.abstractFactory.impl.shape.Circle;
import com.manqingxing.abstractFactory.impl.shape.Rectangle;
import com.manqingxing.abstractFactory.impl.shape.Square;

public class ShapeFactory extends AbstractFactory {

	@Override
	public Shape getShape(String shapeType) {
		if (shapeType == null) {
			return null;
		}
		if (shapeType.equalsIgnoreCase("CIRCLE")) {
			return new Circle();
		} else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		} else if (shapeType.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}
		return null;
	}

	@Override
	public Color getColor(String color) {
		return null;
	}
}