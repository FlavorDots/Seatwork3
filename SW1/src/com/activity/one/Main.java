package com.activity.one;

import com.activity.one.util.C;

public class Main {

    public static void main(String[] args) {

        System.out.println("The output for Class A is " + outputClassA());
            outputClassB();
            outputClassC(100);
    }

    public static Boolean outputClassA(){
        return A.bool;
    }

    public static void outputClassB(){
        B.getDay();
    }

    public static void outputClassC(int result){
        System.out.println("\n" + C.displayInt(result));
    }
}
