package tn.essat.model;

public class Livre {
	private int id;
	private String titre;
	private Categorie cat;
	
	public Livre() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Livre(int id, String titre, Categorie cat) {
		super();
		this.id = id;
		this.titre = titre;
		this.cat = cat;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}

	public Categorie getCat() {
		return cat;
	}

	public void setCat(Categorie cat) {
		this.cat = cat;
	}
	

}
