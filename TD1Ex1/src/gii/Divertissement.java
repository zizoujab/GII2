package gii;

public class Divertissement extends Emission {

	 String nom;
	 String animateur;

	public Divertissement(String id, String nom, int duree, String animateur) {
		this.id = id ; 			
		this.duree = duree ;	
		// ou bien 
		// super ( id, duree ) 
		
		this.nom = nom ;
		this.animateur = animateur ;
	}

	@Override
	public String toString() {
		return "Divertissement [nom=" + nom + ", animateur=" + animateur
				+ ", id=" + id + ", duree=" + duree + "]";
	}
	
	
	
}
