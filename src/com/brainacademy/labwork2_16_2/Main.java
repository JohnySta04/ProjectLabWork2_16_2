package com.brainacademy.labwork2_16_2;

public class Main {

    public static void foo(int i) {
        System.out.println("int");
    }

    public static void foo(Byte b) {
        System.out.println("Byte");
    }

    public static void main(String[] strings) {

        System.out.println("******************************************");
        System.out.println("Labwork 2.16.2");
        System.out.println("-------------------------------------------");

        byte b = 5;
        foo(b);

        System.out.println("******************************************");
    }
}
