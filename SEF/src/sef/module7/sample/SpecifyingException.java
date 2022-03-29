package sef.module7.sample;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class SpecifyingException {
    public static void main(String[] args) throws NullPointerException, FileNotFoundException {
        String str = null;
        str.toString();

        String filename = "NoFile.txt";
        FileReader reader;
        reader = new FileReader(filename);
    }
}
