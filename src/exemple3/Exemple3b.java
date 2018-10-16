package exemple3;

import java.io.File;
import java.io.IOException;

public class Exemple3b {

	public static void main(String[] args) {
		// cr�er un objet repr�sentant un fichier existant
		File f = new File(System.getProperty("user.dir") + "//MonFichier.txt");
		
		
		//cr�ation du bool�en pour v�rifier la cr�ation du fichier
		boolean bool = false;
		boolean bool2 = false;
		
		bool2 = f.delete();
		System.out.println("File deleted : "+bool2);
		// m�thode pour tenter de cr�er un fichier_s'il existe d�j�, la m�thode retourne false
		// s'il n'existe pas, la m�thode retourne true et le fichier est cr��
        try {
			bool = f.createNewFile();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
        
        // v�rifier dans la console la cr�ation du fichier
        System.out.println("File created : "+bool);

	}

}
