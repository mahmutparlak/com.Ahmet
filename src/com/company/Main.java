package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Kaan");
        System.out.println("Kivircik");
        System.out.println("problem solved");
        System.out.println("Maho");
        System.out.println("Kiro");
        System.out.println("Fetullah kazanacak");

        System.out.println("Herhal tayyip bu sene olur");
        System.out.println("Tayyip top olsun. Bahceli de zaten top");

        System.out.println(test());
        test2();
    }

    public static int i;

    public static int test() {
        i = 10;
        return i;
    }

    public static void test2() {
        int j = 30;
        System.out.println(j+i);
    }
}
