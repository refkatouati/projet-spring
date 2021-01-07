package tn.essat.model;

public class Categorie {
	private int id;
	private String libele;

	public Categorie(int id, String libele) {
		super();
		this.id = id;
		this.libele = libele;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLibele() {
		return libele;
	}

	public void setLibele(String libele) {
		this.libele = libele;
	}

}
