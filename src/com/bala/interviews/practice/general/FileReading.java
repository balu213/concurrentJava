package com.bala.interviews.practice.general;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.StringTokenizer;

public class FileReading {
    public static void main(String[] args) throws IOException {
        /*
         * FileReader fs = new
         * FileReader("/Users/bala/Documents/My Learning/test.csv");
         * BufferedReader br = new BufferedReader(fs);
         * 
         * String ss = br.readLine(); while (ss != null) { StringTokenizer st =
         * new StringTokenizer(ss, ","); while (st.hasMoreTokens()) { String st1
         * = st.nextToken(); System.out.println(st1); } } Buf
         */
        BufferedReader reader = Files.newBufferedReader(Paths.get("/Users/bala/Documents/My Learning/test.csv"),
                Charset.forName("US-ASCII"));
        String line = null;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
            StringTokenizer st = new StringTokenizer(line, ",");
            int i = 0;
            while (st.hasMoreTokens() && i == 2) {
                st.countTokens();
                i++;
            }
        }
    }

}
