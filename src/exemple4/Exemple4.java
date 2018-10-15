package exemple4;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Exemple4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileOutputStream fos;
		try {
			fos = new FileOutputStream("MonZoo.ser");
			
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			Object monChien = "Milou";
			oos.writeObject(monChien);
			Object monCanard = "Hubert";
			oos.writeObject(monCanard);
			
			oos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
