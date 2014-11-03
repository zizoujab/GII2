package gii;

public class ListeEmissions {
	Emission emissions[] ;
	public final int NBRE_MAX_EMISSIONS = 4 ;
	// on va utiliser cet attribut comme compteur du tableau
	private  int index ; 

	public ListeEmissions() {
		this.emissions = new Emission[NBRE_MAX_EMISSIONS];
		this.index = 0 ;
	}
	/*
	 * Ajoute une emission dans la derniere casse du tableau et retourne l'indice 
	 * dans laquelle on a ajoute la nouvelle emission
	 */
	public int ajouterEmission(Emission e ){
		this.emissions[index++] = e ;
		return index ;
	}
	
	public void tousLesDivertissements() {
		for ( Emission e : emissions ){
			System.out.print("cette emission dure "+ e.duree );
			// il faut tester sur le type d'objet car le tableau comporte
			// des instance de Fiction et de Divertissement et l'attribut animateur est 
			// specifique au Divertisssement 
			if ( e instanceof Divertissement  ) {
				// si on enleve cette ligne de casting on aura une erreur de compilation
				Divertissement d = (Divertissement) e ;
				System.out.print(" elle a comme animateur "+ d.animateur );
			}
			System.out.println();
		}
	}
	
	public void toutesLesEmissions(){
		for ( Emission e : emissions ) {
			
			System.out.println(e); // pas besoin d'ecrire e.toString() java va l'excuter automatiquement
		}
	}
	
	

}
