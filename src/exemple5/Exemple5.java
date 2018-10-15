package exemple5;

import java.io.FileWriter;
import java.io.IOException;

public class Exemple5 {

	public static void main(String[] args) {
		// écrire du texte dans un fichier
		try {
			FileWriter fw = new FileWriter("MonFichier.txt");
			fw.write("bonjour");
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
