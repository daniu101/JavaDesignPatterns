/**
 * File Name:AbstractFactory.java
 * Package Name:com.manqingxing.abstractFactory
 * Create Time:2018年8月14日下午11:06:56
 * <p>Copyright Reserved ®2018 Tensorlib.com  </p>
 *
*/

package com.manqingxing.abstractFactory.factory;

import com.manqingxing.abstractFactory.Color;
import com.manqingxing.abstractFactory.Shape;

public abstract class AbstractFactory {

	public abstract Color getColor(String color);

	public abstract Shape getShape(String shape);
}