package exemple3;

import java.io.File;

public class Exemple3 {

	public static void main(String[] args) {
		// créer un objet représentant un fichier existant
		File f = new File("MonFichier.txt");

		// créer un répertoire
		File rep = new File("MonRepertoire");
		rep.mkdir();

		// lister le contenu d'un répertoire

		if (rep.isDirectory()) {
			String[] contenuRep = rep.list();
			for (String contenu : contenuRep) {
				System.out.println(contenuRep);
			}
		}
		
		// obtenir le chemin absolu d'un fichier ou d'un répertoire
		
		System.out.println(rep.getAbsolutePath());
		
		// supprimer un fichier ou un répertoire
		
		boolean supprime = f.delete();

	}

}
