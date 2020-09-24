package ru.mirea.lab5;



public class zadanie_3
{
    public static void  recursion(int  A, int B) {
        if (A > B) {
            System.out.println(A+ "  "+B );
        } else if (B > A) {
            System.out.print(B+ " " +A);
        }

    }

    public static void main(String[] args) {
        recursion(15,20);
    }
}


