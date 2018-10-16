package exercices;

public class Client {
	
	String nom;
	String prenom;
	int reference;
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getReference() {
		return reference;
	}

	public void setReference(int reference) {
		this.reference = reference;
	}

	public Client(String nom, String prenom, int reference) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.reference = reference;
	}

	@Override
	public String toString() {
		return reference + ":" + prenom + ":" + nom + "\n";
	}
	
	

}
