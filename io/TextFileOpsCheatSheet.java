package io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextFileOpsCheatSheet {
    public static void main(String[] args) {
        System.out.println("File Operations Cheat Sheet");

        String filePath = "io/Greetings.txt";

        try (FileWriter fileWriter = new FileWriter(filePath)) {
            fileWriter.write("Hello World!");
            fileWriter.append("\n");
            fileWriter.append("Welcome to Java Programming!");
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("File written successfully!");

        try(FileReader fileReader = new FileReader(filePath)) {
            int ch;
            while ((ch = fileReader.read()) != -1) {
                System.out.print((char) ch);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
