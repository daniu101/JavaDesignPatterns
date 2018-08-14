package com.manqingxing.abstractFactory.factory;

import com.manqingxing.abstractFactory.Color;
import com.manqingxing.abstractFactory.Shape;

public abstract class AbstractFactory {

	public abstract Color getColor(String color);

	public abstract Shape getShape(String shape);
}