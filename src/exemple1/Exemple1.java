package exemple1;

import java.io.File;
import java.io.FileFilter;

public class Exemple1 {

	public static void main(String[] args) {
		// répertoire de recherche
		String rep = "C:\\Users\\vanessa\\Documents\\GitHub\\File\\src";
		// construction d'un fichier sur ce répertoire
		File repFile = new File(rep);
		
		// filtrage du contenu de ce répertoire
		//on passe en paramètre une instance de classe anonyme

		File[] fichiersJava = repFile.listFiles(new FileFilter() {
			//cette interface n'a qu'une unique méthode
			public boolean accept(File pathname) {
				//on récupère le nom de ce fichier
				String fileName = pathname.getName();
				//et on teste s'il se termine par .java
				return fileName.endsWith(".java");
			}

		}

		);

		for (File file : fichiersJava) {
			System.out.println(file);
		}

	}

}
