package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setPenColor(StdDraw.MAGENTA);
		StdDraw.filledRectangle(0, 0, 1.0, 1.0);
		
		StdDraw.setPenColor(StdDraw.RED);
		StdDraw.filledCircle(0.2, 0.2, 0.1);
		
		StdDraw.setPenColor(StdDraw.CYAN);
		StdDraw.setPenRadius(0.1);
		StdDraw.ellipse(0.65, 0.65, 0.2, 0.3);
		StdDraw.filledRectangle(.65, 0.65, .1, 0.1);
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.rectangle(0, 0, 1, 1);
		
		
		
		
	}
}