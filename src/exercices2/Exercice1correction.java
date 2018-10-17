package exercices2;

import java.util.Scanner;

/*
 * calculer la moyenne de notes données au clavier
 * demande des notes jusqu'à ce que le mot-clé "fini" soit donné
 * le système s'arrête et donne la moyenne
 * chaque notre doit être comprise entre 0 et 20
 * chaque input doit être numérique
 */

public class Exercice1correction {

	public static int readNumber(String line) {

		int note = 0;

		try {

			note = Integer.parseInt(line);
			if (note >= 0 && note <= 20) {
				return note;
			}
			else {
				System.out.println("Veuillez entrer un nombre entre 0 et 20.");
				return -1;
			}
		}

		catch (NumberFormatException e) {
			System.out.println("Veuillez entrer un nombre.");
		}
		return -1;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String line = null;
		double total = 0;
		int nbNotes = 0;
		int nb;
		int statusNumber = 0;

		// tant que l'input utilisateur n'est pas égal à "fini", la boucle se relance
		while (!(line = scan.nextLine()).equals("fini")) {

			statusNumber = readNumber(line);
			if (statusNumber != -1) {
				total += readNumber(line);
				nbNotes++;
			}
		}
		if (nbNotes != 0)
		System.out.println("La moyenne est de " + (total / nbNotes));
		else
		System.out.println("Veuillez entrer au moins un nombre.");
	}

}
