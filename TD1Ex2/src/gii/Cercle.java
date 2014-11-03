package gii;

import java.awt.Color;

public class Cercle extends Figure2D {
	double  xCentre ;
	double yCentre ;
	double rayon ;
	
	
	public Cercle(Color couleur, double xCentre, double yCentre, double rayon) {
		super(couleur);
		this.xCentre = xCentre;
		this.yCentre = yCentre;
		this.rayon = rayon;
	}

	@Override
	void translater(double x) {
		// faire une translation 
		System.out.println(" Je suis une Cercle ,  j'effectue une translation de  "+ x +" cm ");
	}

	@Override
	void changerEchelle(double coeff) {
		// faire un zoom avant ou arriere 
		System.out.println(" Je suis une Cercle , je change d'echelle avec un coefficcien " + coeff);
		
	}

	
}
