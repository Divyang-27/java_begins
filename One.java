class One { // class 
    public static void main(String a[]){ // main method 
        
        System.out.println("Hello world");
        // Data Types in Java 
        float  f = 1.4f;
        double d = 1.50000; // double is more precise than float 
        System.out.println(d);
        System.out.println(f);
        // int long short byte 
        int i = 10; 
        long l = 10000000000L;
        short s = 1000; 
        byte b = 100;
        System.out.println(i); // 4 bytes 
        System.out.println(l); // 8 bytes
        System.out.println(s); // 2 bytes 
        System.out.println(b); // 1 byte

        // numtypes can be writtten in binary, octal and hexadecimal
        int binary = 0b1010; // binary representation of 10
        int octal = 012; // octal representation of 10     
        int hexadecimal = 0xA; // hexadecimal representation of 10
        int amount = 10_00_000; // can be written with underscore for clarity 
        System.out.println("binary: " + binary);
        System.out.println("octal: " +octal);
        System.out.println("hexadecimal: " +hexadecimal);
        System.out.println(amount);
        //String related Data Types
        char name  = 'A'; // char is used to store single character and it is 2 bytes in size
        String str = "Hello world"; // String is used to store a sequence of characters and it is not a primitive data type, it is a class in Java
        System.out.println(name);
        System.out.println(str);

        // boolean data type
        boolean isJavaFun = true; // boolean is used to store true or false values and it is 1 byte in size
        System.out.println(isJavaFun);
    }
    
}
