package javaIO.teste;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TesteSerializacao {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		// Imprimindo uma string num arquivo bin�rio:
		
//		String nome = "Nico Steppat";
//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("objeto.bin"));
//		oos.writeObject(nome);
//		oos.close();
		
		// Lendo um arquivo bin�rio e transformando em String:
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("objeto.bin"));
		String nome = (String) ois.readObject();
		System.out.println(nome);
	}

}
