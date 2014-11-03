package gii;

import java.awt.Color;

public class Rectangle extends Figure2D {
	double xCoinSuperieurGauche ;
	double yCoinSuperieurGauche ;
	double longueur ;
	
	
	
	
	public Rectangle(Color couleur , double xCoinSuperieurGauche, double yCoinSuperieurGauche,
			double longueur) {
		super(couleur);
		this.xCoinSuperieurGauche = xCoinSuperieurGauche;
		this.yCoinSuperieurGauche = yCoinSuperieurGauche;
		this.longueur = longueur;
	}

	@Override
	void translater(double x) {
		// faire une translation 
		System.out.println(" Je suis un rectangle ,  j'effectue une translation "+ x +" cm ");
	}

	@Override
	void changerEchelle(double coeff) {
		// faire un zoom avant ou arriere 
		System.out.println(" Je suis un rectangle , je change d'echelle avec un coefficcien " + coeff);
		
	}
	
}
