package org.apache.maven.archetypes.maven_archetypes_quickstart;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadText {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("data/sample.txt"));
            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
