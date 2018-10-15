
public class Exo {

	public static void main(String[] args) {
		// permet d'afficher le chemin absolu vers le répertoire courant
		System.out.println(System.getProperty("user.dir"));
		//permet d'afficher les chemin vers le dossier des fichiers temporaires de java
		System.out.println(System.getProperty("java.io.tmpdir"));
	}

}
