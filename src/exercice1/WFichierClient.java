package exercice1;

import java.io.BufferedWriter;
import java.io.File;
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Client[] myClients = new Client[3];
		
		Client client1 = new Client("Bob", "Morane", 12);
		Client client2 = new Client("Bruce", "Wayne", 3);
		Client client3 = new Client("Corben", "Dallas", 18);
		
		myClients[0] = client1;
		myClients[1] = client2;
		myClients[2] = client3;
		
		String myFile = "clients.txt";
		
		try {
			ecrire(myClients, myFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	

}
