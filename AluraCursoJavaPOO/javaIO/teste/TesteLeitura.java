package javaIO.teste;

import java.io.*;

public class TesteLeitura {
	
    public static void main(String[] args) throws IOException {
        // Fluxo de entrada com um arquivo

        InputStream fis = new FileInputStream("lorem.txt");
        Reader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        String linha = br.readLine();        
        
        while (linha != null) {
        	System.out.println(linha);
        	linha = br.readLine();
        }

        br.close();
    }

}
