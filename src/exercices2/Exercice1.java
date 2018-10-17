package exercices2;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * calculer la moyenne de notes données au clavier
 * demande des notes jusqu'à ce que le mot-clé "fini" soit donné
 * le système s'arrête et donne la moyenne
 * chaque notre doit être comprise entre 0 et 20
 * chaque input doit être numérique
 */

public class Exercice1 {

	public static boolean isInteger(String s) {
		try {
			Integer.parseInt(s);
		} catch (NumberFormatException e) {
			return false;
		} catch (NullPointerException e) {
			return false;
		}
		// only got here if we didn't return false
		return true;
	}

	public static String calculMoyenne() {
				
		double moyenne = 0;
		String moyenneArrondie = "0";
		DecimalFormat df = new DecimalFormat(".##");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Entrez un nombre entre 0 et 20 : ");
		String line;
		int nb;
		double total = 0;
		int iterations = 0;
		
		while ((line = sc.nextLine()).equals("fini") == false) {
		
		sc = new Scanner(System.in);
		System.out.print("Entrez un nombre entre 0 et 20 : ");
			
		if (isInteger(line)) {
			nb = Integer.parseInt(line);
			if (nb >= 0 && nb <= 20) {
				total += nb;
				iterations ++;
			}	
		}
		else {
			System.out.println("Veuillez entrer un nombre valide.");
		}
		}
		if (iterations != 0) {
			moyenne = total / iterations;
			moyenneArrondie = df.format(moyenne);
			return moyenneArrondie;
		}
		
		else
			return "0";
		
		
	}
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("La moyenne est de " + calculMoyenne());
	}

}
