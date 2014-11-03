package gii;

import java.awt.Color;

public class TestFigures {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Figure2D cercle  = new Cercle(Color.BLACK, 0, 0, 10);
		Figure2D rectangle =  new Rectangle(Color.WHITE, 1, 1, 8.15);
		cercle.translater(5);
		rectangle.changerEchelle(.5);

	}

}
