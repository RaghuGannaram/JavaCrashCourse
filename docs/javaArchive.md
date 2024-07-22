
# Creating and Running a JAR File from a Java Application

## Creating a JAR File

### Step 1: Set Up Your Project

Ensure your project directory structure is organized. For example:

```
my-java-project/
├── src/
│   └── com/
│       └── yourpackage/
│           ├── MainClass.java
│           └── AnotherClass.java
├── bin/
└── MANIFEST.MF
```

### Step 2: Compile Your Java Classes

Compile your Java source files to the `bin` directory. Open a terminal and navigate to the project root directory.

```sh
javac -d bin src/com/yourpackage/*.java
```

### Step 3: Create a JAR File

Create a JAR file from the compiled classes. If you do not need to specify a main class (non-executable JAR):

```sh
jar cf myapp.jar -C bin .
```

If you need to create an executable JAR, first create a `MANIFEST.MF` file with the following content:

```
Manifest-Version: 1.0
Main-Class: com.yourpackage.MainClass
```

Then create the JAR file including the manifest:

```sh
jar cfm myapp.jar MANIFEST.MF -C bin .
```

### Example `MANIFEST.MF`

```
Manifest-Version: 1.0
Main-Class: com.yourpackage.MainClass
```

## Running a JAR File

### Step 1: Ensure Java is Installed

Ensure that Java is installed and the `java` command is available in your terminal. You can check this by running:

```sh
java -version
```

### Step 2: Run the JAR File

If you created a non-executable JAR file, you need to specify the class with the `main` method explicitly:

```sh
java -cp myapp.jar com.yourpackage.MainClass
```

If you created an executable JAR file, you can run it directly using the `-jar` option:

```sh
java -jar myapp.jar
```

## Example Java Code

### `MainClass.java`

```java
package com.yourpackage;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

### `AnotherClass.java`

```java
package com.yourpackage;

public class AnotherClass {
    public void printMessage() {
        System.out.println("This is another class.");
    }
}
```

## Summary

- **Compile Java classes**: `javac -d bin src/com/yourpackage/*.java`
- **Create a JAR file**:
  - Non-executable: `jar cf myapp.jar -C bin .`
  - Executable: `jar cfm myapp.jar MANIFEST.MF -C bin .`
- **Run the JAR file**:
  - Non-executable: `java -cp myapp.jar com.yourpackage.MainClass`
  - Executable: `java -jar myapp.jar`
