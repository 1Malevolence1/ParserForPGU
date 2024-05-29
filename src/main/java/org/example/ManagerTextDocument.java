package org.example;

import java.io.*;
import java.util.List;

public class ManagerTextDocument {

    private List<Post> list;

    private final String TEXTDOC = "C:/Users/Administrator/Desktop/ParserForPGU/src/main/java/org/example/baseDate.txt";

    public ManagerTextDocument(List<Post> list) {
        this.list = list;
    }

    public ManagerTextDocument() {
    }

    public void write() {
        try (PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(TEXTDOC)))) {
            for (Post post : list
            ) {
                writer.write(post.toString());
                writer.write("\n");

            }

        } catch (IOException e) {
            System.err.println("Произошла ошибка во время записи");
        }
    }

    public void read() {
        try (BufferedReader reader = new BufferedReader(new FileReader(TEXTDOC))) {

            String line;
            while ((line = reader.readLine()) != null) System.out.println(line);

        } catch (IOException e) {
            System.err.println("Ошибка при чтении файла: " + TEXTDOC);
        }
    }
}
