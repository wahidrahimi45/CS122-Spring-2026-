package org.example;

public class PrimitiveTypes {
    public static void main(String[] args) {
        /*
            byte
            short
            int
            long
            float
            double
            char
            boolean
         */

//        byte myByte = 10;
//        System.out.println("byte data type information");
//        System.out.println("Max value: "+ Byte.MAX_VALUE);
//        System.out.println("Min value: "+ Byte.MIN_VALUE);
//        System.out.println("Size: "+ Byte.BYTES);
//        System.out.println("--------------------------------");
//        short myShort = 10;
//        System.out.println("short data type information");
//        System.out.println("Max value: "+ Short.MAX_VALUE);
//        System.out.println("Min value: "+ Short.MIN_VALUE);
//        System.out.println("Size: "+ Short.BYTES);
//        System.out.println("--------------------------------");
//        int myInt = 10;
//        System.out.println("int data type information");
//        System.out.println("Max value: "+ Integer.MAX_VALUE);
//        System.out.println("Min value: "+ Integer.MIN_VALUE);
//        System.out.println("Size: "+ Integer.BYTES);
//
//        System.out.println("--------------------------------");
//        long longValue = 10;
//        System.out.println("long data type information");
//        System.out.println("Max value: "+ Long.MAX_VALUE);
//        System.out.println("Min value: "+ Long.MIN_VALUE);
//        System.out.println("Size: "+ Long.BYTES);
//
//        System.out.println("--------------------------------");
//        float myFloat = 10.9f;
//        System.out.println("float data type information");
//        System.out.println("Max value: "+ Float.MAX_VALUE);
//        System.out.println("Min value: "+ Float.MIN_VALUE);
//        System.out.println("Size: "+ Float.BYTES);
//
//        System.out.println("--------------------------------");
//        double doubleValue = 10.6;
//        System.out.println("Double data type information");
//        System.out.println("Max value: "+ Double.MAX_VALUE);
//        System.out.println("Min value: "+ Double.MIN_VALUE);
//        System.out.println("Size: "+ Double.BYTES);

//        int age = 200000;
//
//        byte newAge = (byte) age;

//        double num = 345.66;
//
//        System.out.println((int) Math.floor(num));
//        System.out.println((long) num);

        checkPrimitiveFit(444);

        int intNumber = 1000000;

        short shortNumber = (short) intNumber;

        System.out.println(intNumber);
        System.out.println(shortNumber);
    }
    public static void checkPrimitiveFit(double value)
    {
        boolean isInteger = value == Math.floor(value);

        if(isInteger) // if integer
        {
            if(value >= Byte.MIN_VALUE && value <= Byte.MAX_VALUE)
            {
                System.out.println("byte");
            }
            if(value >= Short.MIN_VALUE && value <= Short.MAX_VALUE)
            {
                System.out.println("short");
            }
            if(value >= Integer.MIN_VALUE && value <= Integer.MAX_VALUE)
            {
                System.out.println("int");
            }
        }
        else
        {
            if(value >= Float.MIN_VALUE && value <= Float.MAX_VALUE)
            {
                System.out.println("float");
            }
        }
        System.out.println("double");
    }

}
