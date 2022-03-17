package br.com.alura.java.io.teste;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TesteUnicodeEncoding {
    public static void main(String[] args) {
        String s = "C";
        System.out.println(s.codePointAt(0));

        Charset charset= Charset.defaultCharset();
        System.out.println(charset.displayName());

        byte[] bytes = s.getBytes();
        System.out.println(bytes.length + ", UTF-8");
    }
}
