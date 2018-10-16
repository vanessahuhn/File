package exercices;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class RFichierClient {
	
	public static int compterLignes(BufferedReader br) throws IOException {
				
		// permet de stocker le contenu chaque ligne
		String line;
		
		// permet de stocker le nombre de lignes
		int nbLines = 0;
		
		//on parcourt le fichier pour conna�tre le nombre de lignes
		//afin de d�finir la taille du tableau
		while ((line = br.readLine()) != null) {
			nbLines++;
		}
		br.close();
		return nbLines;
	}
	
	//m�thode permettant de lire un fichier
	public static Client[] lire(String myFile) throws IOException {
		
		BufferedReader br = new BufferedReader (
				new FileReader (
						new File(myFile)
						));
		//je d�clare mon tableau de Client avec pour taille le retour
		//de la m�thode compterLignes		
		//(c'est-�-dire le nombre de lignes de mon fichier)
		Client[] clients = new Client[compterLignes(br)];
		br = new BufferedReader (
				new FileReader (
						new File(myFile)
						));
		String line;
		int i = 0;
		while ((line = br.readLine()) != null) {
			//on decoupe la ligne en substring grace au caractere ':'
			//chaque substring est utilis�e en argument du constructeur de la classe client
			clients[i] = new Client(
					//argument 1 : le nom
					line.substring(line.lastIndexOf(':')+1, line.length()),
					//argument 2 : le prenom
					line.substring(line.indexOf(':')+1, line.lastIndexOf(':')),
					//argument 3 : la reference
					//cet argument est un int or on recupere une string, on  doit donc la parser (la transformer)
					Integer.parseInt(line.substring(0, line.indexOf(':')))
					);
			i++;
		}
		return clients;
	}

}
