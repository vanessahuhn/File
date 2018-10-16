package exercices;

import java.io.IOException;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Client[] myClients = new Client[3];

		Client client1 = new Client("Morane", "Bob", 12);
		Client client2 = new Client("Wayne", "Bruce", 3);
		Client client3 = new Client("Dallas", "Corben", 18);

		myClients[0] = client1;
		myClients[1] = client2;
		myClients[2] = client3;

		String myFile = "clients.txt";

		try {
			WFichierClient.ecrire(myClients, myFile);
			for(Client client : RFichierClient.lire(myFile))
			{
				System.out.println(client);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
