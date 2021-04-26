package javaIO.teste;

import java.io.*;
import java.net.Socket;;

public class TesteCopiarArquivo {

	public static void main(String[] args) throws IOException {
		// Fluxo de entrada com um arquivo
		
		Socket socket = new Socket(); 		

		InputStream fis = socket.getInputStream();			// System.in; (p/ console) | new FileInputStream("lorem.txt"); (p/ arquivos)
		Reader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		
        OutputStream fos = socket.getOutputStream();		// System.out; (p/ console) | new FileOutputStream("lorem2.txt"); (p/ arquivos)
        Writer osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);
        
        String linha = br.readLine();  
        
        while (linha != null && !linha.isEmpty()) {
        	bw.write(linha);
        	bw.newLine();
        	bw.flush();										// Manda automaticamente, logo ap�s de mudar de linha.
        	linha = br.readLine();
        }
        
        br.close();
        bw.close();
	}
}

