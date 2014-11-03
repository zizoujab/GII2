package gii;

import java.awt.Color;

public abstract  class Figure2D {
	Color couleur ;
	
	public Figure2D(Color couleur) {
		super();
		this.couleur = couleur;
	}
	abstract void translater(double x );
	abstract void changerEchelle(double coeff );

}
