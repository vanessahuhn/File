package exemple3;

import java.io.File;
import java.io.IOException;

public class Exemple3 {

	public static void main(String[] args) {
		// cr�er un objet repr�sentant un fichier existant
		File f = new File("MonFichier.txt");

		// cr�er un r�pertoire
		File rep = new File("MonRepertoire");
		rep.mkdir(); // .mkdir() = m�thode pour cr�er le r�pertoire

		// m�thode pour tenter de cr�er un fichier_s'il existe d�j�, la m�thode retourne
		// false
		// s'il n'existe pas, la m�thode retourne true et le fichier est cr��
		try {
			boolean bool = false;
			bool = f.createNewFile();

		} catch (IOException e) {
			e.printStackTrace();
		}

		f.renameTo(new File(System.getProperty("user.dir") + "\\MonRepertoire\\MonFichier.txt"));

		// lister le contenu d'un r�pertoire
		if (rep.isDirectory()) { // isDirectory() = m�thode pour savoir
			// si rep est un r�pertoire
			String[] contenuRep = rep.list(); // list() = m�thode qui retourne un tableau de strings
			// contenant le nom des fichiers et dossiers se trouvant dans le r�pertoire rep

			//pour chaque contenu de mon tableau contenuRep
			for (String contenu : contenuRep) {
				//j'imprime contenu
				System.out.println(contenu);
			}
		}

		// obtenir le chemin absolu d'un fichier ou d'un r�pertoire
		System.out.println(rep.getAbsolutePath());

		// supprimer un fichier ou un r�pertoire
		boolean supprime = f.delete();

	}

}
