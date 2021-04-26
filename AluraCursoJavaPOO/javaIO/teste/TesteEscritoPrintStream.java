package javaIO.teste;

import java.io.*;

public class TesteEscritoPrintStream {

	public static void main(String[] args) throws IOException {        

//		OutputStream fos = new FileOutputStream("lorem2.txt");
//		Writer osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);
//
//		FileWriter fw = new FileWriter("lorem2.txt");
//
//		BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));
		
//		PrintStream ps = new PrintStream(new File("lorem2.txt"));
		
//		PrintStream con = System.out; 							// Caso eu queira que saia pro console.
		
		
		PrintWriter ps = new PrintWriter("lorem2.txt");
		
		ps.println("Lorem ipsum dolor sit amet, consecturo asdasdasda");
		ps.println();
		ps.println();
		ps.print("papapapapapa pspspspsps popopopop");
		ps.close();
	}

}
