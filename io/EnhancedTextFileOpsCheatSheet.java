package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class EnhancedTextFileOpsCheatSheet {
    public static void main(String[] args) {
        System.out.println("File Operations Cheat Sheet");

        String filePath = "io/EnhancedGreetings.txt";

        try (BufferedWriter fileBufferWriter = new BufferedWriter(new FileWriter(filePath))) {
            fileBufferWriter.write("Hello World!");
            fileBufferWriter.append("\n");
            fileBufferWriter.append("Welcome to Java Programming!");
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("File written successfully!");

        try (BufferedReader fileBufferReader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = fileBufferReader.readLine()) != null) {
                System.out.print(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
