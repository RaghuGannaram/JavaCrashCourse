package io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BinFileOpsCheatSHeet {

    public static void main(String[] args) {
        System.out.println("Binary File Operations Cheat Sheet");

        String filePath = "io/numericalData.bin";

        // Data to write
        int intValue = 123;
        double doubleValue = 123.45;
        boolean booleanValue = true;

        // Writing to a binary file
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(filePath))) {
            dos.writeInt(intValue);
            dos.writeDouble(doubleValue);
            dos.writeBoolean(booleanValue);
            System.out.println("Data written to the binary file.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Reading from a binary file
        try (DataInputStream dis = new DataInputStream(new FileInputStream(filePath))) {

            System.out.println("Data read from the binary file:");
            System.out.println("Integer: " + dis.readInt());
            System.out.println("Double: " + dis.readDouble());
            System.out.println("Boolean: " + dis.readBoolean());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
