package com.activity.one;

public class B {
    protected static String[] days = {"M", "T", "W", "Th", "F", "Sat", "Sun"};

    public static void getDay(){
        for (String day : days){
            System.out.print(day + " ");
        }
    }
}
