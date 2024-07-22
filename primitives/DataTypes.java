package primitives;

public class DataTypes {
    public static void main(String[] args) {
        // byte: 1 byte, range: -128 to 127
        byte byteVar = 100;
        System.out.println("byte variable: " + byteVar);

        // short: 2 bytes, range: -32,768 to 32,767
        short shortVar = 10000;
        System.out.println("short variable: " + shortVar);

        // int: 4 bytes, range: -2^31 to 2^31-1
        int intVar = 100000;
        System.out.println("int variable: " + intVar);

        // long: 8 bytes, range: -2^63 to 2^63-1 | suffix: L or l indicates long
        long longVar = 10000000000L;
        System.out.println("long variable: " + longVar);

        // float: 4 bytes, range: approximately ±3.40282347E+38F (6-7 significant
        // decimal digits) | suffix: F or f indicates float
        float floatVar = 10.5F;
        System.out.println("float variable: " + floatVar);

        // double: 8 bytes, range: approximately ±1.79769313486231570E+308 (15
        // significant decimal digits)
        double doubleVar = 10.5;
        System.out.println("double variable: " + doubleVar);

        // char: 2 bytes, range: 0 to 65,535 (unsigned)
        char charVar = 'A';
        System.out.println("char variable: " + charVar);

        // boolean: 1 bit, values: true or false
        boolean booleanVar = true;
        System.out.println("boolean variable: " + booleanVar);

        // Demo usage of the variables
        byteVar += 10;
        shortVar -= 5;
        intVar *= 2;
        longVar /= 4;
        floatVar += 5.5f;
        doubleVar -= 1.5;
        charVar = 'B';
        booleanVar = false;

        // Print updated values
        System.out.println("\nUpdated values:");
        System.out.println("byte variable: " + byteVar);
        System.out.println("short variable: " + shortVar);
        System.out.println("int variable: " + intVar);
        System.out.println("long variable: " + longVar);
        System.out.println("float variable: " + floatVar);
        System.out.println("double variable: " + doubleVar);
        System.out.println("char variable: " + charVar);
        System.out.println("boolean variable: " + booleanVar);
    }
}
