package com.casettalab;

import com.casettalab.model.LowerCaseInputStream;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        InputStream inputStream =
                new LowerCaseInputStream(
                        new FileInputStream(
                                new File("resources/text.txt")
                        )
                );

        int charValue = inputStream.read();

        while(charValue != -1) {
            System.out.print((char) charValue);
            charValue = inputStream.read();

        }

    }
}
