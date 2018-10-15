package exemple6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exemple6 {

	public static void main(String[] args) {
		// lire du texte dans un fichier
		
		try {
			File f = new File("MonFichier.txt");
			FileReader fr = new FileReader(f);
			//flot de communication pour les caract�res,
			//qui se connecte � un fichier
			BufferedReader br = new BufferedReader(fr);
			//flot de traitement pour les caract�res (buffer)
			//ce flot est cha�n� au FileReader
			String ligne = null; // contiendra chaque ligne
			while ((ligne = br.readLine()) != null) {
				System.out.println(ligne);
			}
			br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
