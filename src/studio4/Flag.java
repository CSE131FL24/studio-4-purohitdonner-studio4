package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.clear();
		StdDraw.setXscale(1, 22);
		StdDraw.setYscale(10, 16);
		StdDraw.setPenColor(254, 123, 12);
		StdDraw.filledRectangle(3, 3, 3, 3);
		StdDraw.filledRectangle(3, 13, 3, 3);
		StdDraw.filledRectangle(16, 3, 6, 3);
		StdDraw.filledRectangle(16, 13, 6, 3);
		StdDraw.setPenColor(1, 32, 126);
		StdDraw.filledRectangle(11, 8, 11, 1);
		StdDraw.filledRectangle(8, 8, 1, 8);
		StdDraw.setPenColor(1, 1, 1);
		StdDraw.filledRectangle(3, 2, 1, 1);
		StdDraw.filledRectangle(0, 1, 1, 3);
		
	}
}