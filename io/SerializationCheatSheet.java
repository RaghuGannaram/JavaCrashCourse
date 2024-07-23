package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationCheatSheet {

    public class User implements Serializable {
        private static final long serialVersionUID = 1L;

        private String email;
        private transient String password;

        public User(String email) {
            this.email = email;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getEmail() {
            return this.email;
        }

        public String getPassword() {
            return this.password;
        }

        @Override
        public String toString() {
            return "User [email=" + email + ", password=" + password + "]";
        }
    }

    public static void main(String[] args) {
        System.out.println("Serialization Cheat Sheet");

        User user = new SerializationCheatSheet().new User("John Doe");
        user.setPassword("password123");

        System.out.println("User object before serialization: " + user);

        String filePath = "io/user.ser";

        // Serialization
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
            oos.writeObject(user);
            System.out.println("User object serialized and written to the file.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialization
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
            User deserializedUser = (User) ois.readObject();
            System.out.println("User object deserialized from the file: " + deserializedUser);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
