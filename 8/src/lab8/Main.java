package lab8;

import java.io.*;
import java.nio.charset.Charset;
import java.lang.System;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(new FileInputStream("C:\\Users\\Максим\\Documents\\Универ\\2\\ООП\\8\\1.txt"), Charset.forName("UTF-8")){};
        StringBuilder sb = new StringBuilder();
        int c=reader.read();
        while((c=reader.read())!=-1){
            sb.append((char)c);
        }
        System.out.println(sb);
    }
}
