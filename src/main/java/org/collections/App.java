package org.collections;

import java.io.*;

/**
 * <a href="https://github.com/aakulovaa/java4.git">...</a>
 */
public class App {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите полный путь к файлу:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String path = reader.readLine();
        ReadFile.readDataFromCustomSeparator(path);
    }
}
