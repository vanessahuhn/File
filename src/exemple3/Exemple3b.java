package exemple3;

import java.io.File;
import java.io.IOException;

public class Exemple3b {

	public static void main(String[] args) {
		// créer un objet représentant un fichier existant
		File f = new File(System.getProperty("user.dir") + "//MonFichier.txt");
		
		
		//création du booléen pour vérifier la création du fichier
		boolean bool = false;
		boolean bool2 = false;
		
		bool2 = f.delete();
		System.out.println("File deleted : "+bool2);
		// méthode pour tenter de créer un fichier_s'il existe déjà, la méthode retourne false
		// s'il n'existe pas, la méthode retourne true et le fichier est créé
        try {
			bool = f.createNewFile();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
        
        // vérifier dans la console la création du fichier
        System.out.println("File created : "+bool);

	}

}
