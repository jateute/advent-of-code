package helpers;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Helpers {
    public static String readFile(String path) throws IOException {
        FileInputStream inputStream = new FileInputStream(path);
        StringBuilder textBuilder = new StringBuilder();
        Reader reader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));
        int c = 0;
        while ((c = reader.read()) != -1) {
            textBuilder.append((char) c);
        }
        return textBuilder.toString();
    }
}