package gii;

public class Fiction extends Emission {

	private String nomFilm;
	private int anneRealisation;
	private String realisateur;

	public Fiction(String id, String nomFilm, int duree, int anneRealisation, String realisateur) {
		super(id,duree);
		this.nomFilm = nomFilm ;
		this.anneRealisation = anneRealisation;
		this.realisateur = realisateur ;
	}

	@Override
	public String toString() {
		return "Fiction [nomFilm=" + nomFilm + ", anneRealisation="
				+ anneRealisation + ", realisateur=" + realisateur + ", id="
				+ id + ", duree=" + duree + "]";
	}
	
	

}
