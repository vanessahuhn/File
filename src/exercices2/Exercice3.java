package exercices2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * copier le contenu d'un fichier dans un autre fichier
 * A	dans une premier temps, nous allons écrire le contenu du fichier au clavier.
 * Pour cela, nous ponvons utiliser un BufferedReader qui permettra de mettre le texte
 * dans une mémoire tampon et un FileReader qui ouvre le texte en lecture.
 * Pour créer le BufferedReader nous pouvons faire 
 * BufferedReader buffer = new BufferedReader(new FileReader(filename)).
 * Pour lire une ligne du fichier, il suffit d'exécuter buffer.readLine().
 * B	Ensuite, modifiez votre code pour écrire les lignes dans le fichier filenameTo.
 * Pour cela, vous aurez besoin de BufferedWriter et FileWriter qui s'utilisent comme ceci :
 * BufferedWriter buffer = new BufferedWriter(new FileWriter(filename))
 * en appelant buffer.write(String s) pour écrire dedans.
 * C	Modifiez votre code pour que le fichier de sortie ne contienne pas les commentaires Java
 * c'est-à-dire les lignes commençant par // et les expressions entre /* et *'/.
 */

//un commentaire

public class Exercice3 {

	public static void copie(String filenameFrom, String filenameTo) throws IOException {
		
		BufferedReader br = new BufferedReader(new FileReader(new File(filenameFrom)));
		BufferedWriter bw = new BufferedWriter(new FileWriter(new File(filenameTo)));
		String line;
		String delimiter = "/" + "*";
		
		while ((line = br.readLine()) != null) {
			
			if (line.trim().startsWith("//"))
				System.out.println("commentaire //");
			
			else if (line.contains(delimiter)) {
				System.out.println("début delimiter");
				while (!((br.readLine()).contains("*/"))) {
				}
				System.out.print("fin delimiter");
			}
			else {
				bw.write(line + "\n");
			}

		}
		br.close();
		bw.close();
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		copie(System.getProperty("user.dir") + "/src//exercices2//Exercice3.java",
				System.getProperty("user.dir") + "/src//exercices2//copie.txt");
	}

}
