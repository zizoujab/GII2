package gii;

public class Reportage extends Emission {
	String theme ;

	public Reportage(String id, int duree, String theme) {
		super(id, duree);
		this.theme = theme;
	}

	@Override
	public String toString() {
		return "Reportage [theme=" + theme + ", id=" + id + ", duree=" + duree
				+ "]";
	}
	
	
	
}
