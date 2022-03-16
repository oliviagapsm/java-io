package br.com.alura.java.io.teste;

import java.io.*;

public class TesteEscritaPrintStreamWriter {
    public static void main(String[] args) throws IOException {
        // Fluxo de entrada com Arquivo

//        OutputStream fos = new FileOutputStream("SQL_Revisao2.txt");
//        Writer osw = new OutputStreamWriter(fos);
//        BufferedWriter bw = new BufferedWriter(osw);

        //FileWriter fw = new FileWriter("SQL_Revisao.txt");
        //BufferedWriter bw = new BufferedWriter(fw);

//        PrintStream ps = new PrintStream("SQL_Revisao2.txt");

        PrintWriter ps = new PrintWriter("SQL_Revisao2.txt");

        ps.println("Lorem jdjkhfkjdshfkdsjhfldsjhflkdsjgf");
        ps.println();
        ps.println("kdjfdkjfdlskjgfdlldpfd");

        ps.close();
    }
}
