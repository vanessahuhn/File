package exercices2;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

/*
 * A.	cr�ez une m�thode void testFile (String path) permettant de tester si le fichier existe, si c'est un fichier ou un r�pertoire
 * B.	si le fichier n'existe pas, alors on le cr�e en utilisant la m�thode File.createNewFile()
 * C.	modifiez votre fonction pour les cas o� il s'agit d'un r�pertoire : �num�rer l'ensemble des fichiers s'y trouvant
 * en donnant leur chemin absolu avec File.getAbsolutePath()
 * D.	on souhaite afficher les fichiers dont l'extension est .java utiliser la fonction String[] list(FilenameFilter filter)
 * l'interface d�crit une m�thode boolean accept(File dir, String name) qui doit retourner true si le fichier doit �tre ajout� � la liste et false sinon
 */

public class Exercice2 {

	public static void testFile(String path) throws IOException {

		File file = new File(path);
		if (file.exists()) {
			System.out.println("Le chemin correspond � un r�pertoire ou un fichier existant.");
			if (file.isFile()) {
				System.out.println("Le chemin m�ne � un fichier.");
			} else if (file.isDirectory()) {
				System.out.println("Le chemin m�ne � un r�pertoire.");
				String[] contenuRep = file.list();
				File[] files = new File[contenuRep.length];

				int i = 0;
				for (String contenu : contenuRep) {
					File repFile = new File(contenu);
					files[i] = repFile;
					System.out.println(repFile.getAbsolutePath());
				}

				FilenameFilter filter = new FilenameFilter() {
					public boolean accept(File dir, String name) {
						if (name.endsWith(".java")) {
							return true;
						} else {
							return false;
						}

					}

				};
				File[] javaFiles = file.listFiles(filter);
				for (File javaFile : javaFiles) {
					System.out.println(javaFile.getAbsolutePath());
				}
			}
		} else {
			file.createNewFile();
			System.out.println("Le chemin ne correspond � aucun r�pertoire ou fichier existant. Il a �t� cr��.");

		}
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		testFile(System.getProperty("user.dir"));
		testFile(System.getProperty("user.dir") + "/clients.txt");
		testFile(System.getProperty("user.dir") + "/inexistant.txt");
		testFile(System.getProperty("user.dir") + "/src//exercices2");
	}

}
