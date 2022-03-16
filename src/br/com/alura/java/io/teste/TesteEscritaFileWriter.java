package br.com.alura.java.io.teste;

import java.io.*;

public class TesteEscritaFileWriter {
    public static void main(String[] args) throws IOException {
        // Fluxo de entrada com Arquivo

//        OutputStream fos = new FileOutputStream("SQL_Revisao2.txt");
//        Writer osw = new OutputStreamWriter(fos);
//        BufferedWriter bw = new BufferedWriter(osw);

        FileWriter fw = new FileWriter("SQL_Revisao.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("jdhfdshfdkjshgfjkdshgkjdfshgfjsghfkjghfdkjg");
        bw.newLine();
        bw.newLine();
        bw.newLine();
        bw.write("fjdjfodjfdijodijgdoijgoigj34frt4");

        bw.close();
    }
}
