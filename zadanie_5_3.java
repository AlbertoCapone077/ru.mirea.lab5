package ru.mirea.lab5_3;

public class zadanie_5_3 {
    public static String  recursion(int n){
        if(n == 1){
            return "1";
        }
        return recursion( n - 1) + " " + n;
    }

    public static void main(String[] args){
        System.out.println(recursion(20)); 
    }
}

