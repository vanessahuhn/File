package exercices;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WFichierClient {
	
	public WFichierClient() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public static void ecrire(Client[] myClients, String myFile) throws IOException {
		BufferedWriter bw = new BufferedWriter (
				new FileWriter(
						new File(myFile)));
		for (Client client : myClients) {
			bw.write(client.toString());
			bw.write("\n");
		}
		bw.close();
	}
	
	public static void lire(String myFile) {
		try {
		BufferedReader br = new BufferedReader (
				new FileReader(
						new File(myFile)));
		String ligne;
		
			while ((ligne = br.readLine()) != null) {
				System.out.println(ligne);
			}
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}	

}
