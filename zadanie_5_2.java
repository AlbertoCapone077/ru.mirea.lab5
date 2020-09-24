package ru.mirea.lab5_2;

public class zadanie_5_2 {
    public static int recursion(int N){
        if ( N < 10){
            return N;
        }
        else{
            return N % 10 + recursion (N / 10);
        }
    }

    public static void main(String[] args){
        System.out.println(recursion(678));
    }
}