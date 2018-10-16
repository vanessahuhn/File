package exemple3;

import java.io.File;
import java.io.IOException;

public class Exemple3 {

	public static void main(String[] args) {
		// créer un objet représentant un fichier existant
		File f = new File("MonFichier.txt");

		// créer un répertoire
		File rep = new File("MonRepertoire");
		rep.mkdir(); // .mkdir() = méthode pour créer le répertoire

		// méthode pour tenter de créer un fichier_s'il existe déjà, la méthode retourne
		// false
		// s'il n'existe pas, la méthode retourne true et le fichier est créé
		try {
			boolean bool = false;
			bool = f.createNewFile();

		} catch (IOException e) {
			e.printStackTrace();
		}

		f.renameTo(new File(System.getProperty("user.dir") + "\\MonRepertoire\\MonFichier.txt"));

		// lister le contenu d'un répertoire
		if (rep.isDirectory()) { // isDirectory() = méthode pour savoir
			// si rep est un répertoire
			String[] contenuRep = rep.list(); // list() = méthode qui retourne un tableau de strings
			// contenant le nom des fichiers et dossiers se trouvant dans le répertoire rep

			//pour chaque contenu de mon tableau contenuRep
			for (String contenu : contenuRep) {
				//j'imprime contenu
				System.out.println(contenu);
			}
		}

		// obtenir le chemin absolu d'un fichier ou d'un répertoire
		System.out.println(rep.getAbsolutePath());

		// supprimer un fichier ou un répertoire
		boolean supprime = f.delete();

	}

}
