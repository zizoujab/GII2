package gii;

public class ProgrammeTele {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Emission labes = new Divertissement("1", "Labes", 120, "Nawfel" );
		Emission matrix  = new Fiction("2", "The Matrix", 60, 1999, "Lana Wachowski" );
		Emission afterEarth  = new Fiction("3", "After earth ", 180, 2013, " M. Night Shyamalan ");
		Emission a7adRiadhi = new Divertissement("4", "Ahad Riadhi ", 300, "chepo");
		ListeEmissions liste = new ListeEmissions();
		liste.ajouterEmission(labes) ;
		liste.ajouterEmission(matrix) ;
		liste.ajouterEmission(afterEarth) ;
		liste.ajouterEmission(a7adRiadhi) ;
		
		liste.tousLesDivertissements();
		
		liste.toutesLesEmissions();
	}

}
