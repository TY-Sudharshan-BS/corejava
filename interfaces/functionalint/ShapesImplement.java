package com.tyss.interfaces.functionalint;

public class ShapesImplement {
	public static void main(String[] args) {

		// inner class
		/*
		 * Shapes s = new Shapes() {
		 * 
		 * @Override public void draw() { System.out.println("drawing square"); } };
		 * s.draw();
		 */

		// functional interface using Lambda expressions
		Shapes s = () -> {
			System.out.println("drawing square");
		};
		s.draw();
	}
}
