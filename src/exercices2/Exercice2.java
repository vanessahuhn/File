package exercices2;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

/*
 * A.	créez une méthode void testFile (String path) permettant de tester si le fichier existe, si c'est un fichier ou un répertoire
 * B.	si le fichier n'existe pas, alors on le crée en utilisant la méthode File.createNewFile()
 * C.	modifiez votre fonction pour les cas où il s'agit d'un répertoire : énumérer l'ensemble des fichiers s'y trouvant
 * en donnant leur chemin absolu avec File.getAbsolutePath()
 * D.	on souhaite afficher les fichiers dont l'extension est .java utiliser la fonction String[] list(FilenameFilter filter)
 * l'interface décrit une méthode boolean accept(File dir, String name) qui doit retourner true si le fichier doit être ajouté à la liste et false sinon
 */

public class Exercice2 {

	public static void testFile(String path) throws IOException {

		File file = new File(path);
		if (file.exists()) {
			System.out.println("Le chemin correspond à un répertoire ou un fichier existant.");
			if (file.isFile()) {
				System.out.println("Le chemin mène à un fichier.");
			} else if (file.isDirectory()) {
				System.out.println("Le chemin mène à un répertoire.");
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
			System.out.println("Le chemin ne correspond à aucun répertoire ou fichier existant. Il a été créé.");

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
