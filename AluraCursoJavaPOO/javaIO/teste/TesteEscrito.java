package javaIO.teste;

import java.io.*;

public class TesteEscrito {
	
    public static void main(String[] args) throws IOException {        

        OutputStream fos = new FileOutputStream("lorem2.txt");
        Writer osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);
        
        bw.write("Lorem ipsum dolor sit amet, consecturo asdasdasda");
        bw.newLine();
        bw.newLine();
        bw.write("asasdasd");
        
        bw.close();        
    }

}
