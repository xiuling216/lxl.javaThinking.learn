package chapter14;

import java.util.Arrays;
import java.util.List;

/**
 * @echo 2013-10-29
 * 
 */
public class Shapes {

	public static void main(String[] args) {
		List<Shape> shapeList = Arrays.asList(new Circle(), new Square(),
				new Triangle());
		for(Shape shape:shapeList)
			shape.draw();
	}
}

abstract class Shape {
	void draw() {
		System.out.println(this + ".draw()");
	}

	abstract public String toString();
}

class Circle extends Shape {
	public String toString() {
		return "Circle";
	}
}

class Square extends Shape {
	public String toString() {
		return "Square";
	}
}

class Triangle extends Shape {
	public String toString() {
		return "Triangle";
	}
}
