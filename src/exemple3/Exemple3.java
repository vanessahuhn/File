package exemple3;

import java.io.File;

public class Exemple3 {

	public static void main(String[] args) {
		// cr�er un objet repr�sentant un fichier existant
		File f = new File("MonFichier.txt");

		// cr�er un r�pertoire
		File rep = new File("MonRepertoire");
		rep.mkdir();

		// lister le contenu d'un r�pertoire

		if (rep.isDirectory()) {
			String[] contenuRep = rep.list();
			for (String contenu : contenuRep) {
				System.out.println(contenuRep);
			}
		}
		
		// obtenir le chemin absolu d'un fichier ou d'un r�pertoire
		
		System.out.println(rep.getAbsolutePath());
		
		// supprimer un fichier ou un r�pertoire
		
		boolean supprime = f.delete();

	}

}
