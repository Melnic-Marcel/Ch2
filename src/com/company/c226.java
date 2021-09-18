package com.company;

import java.util.Scanner;


public class c226 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int N1=0;
        int N2=0;

        System.out.println("Introduceti primul numar:");
        N1=input.nextInt();

        System.out.println("Introduceti al doilea numar:");
        N2=input.nextInt();

        if(number(N1, N2)){
            System.out.println(N1 + " este multiplul lui " + N2);
        }
        else{
            System.out.println(N1 + " nu este multiplul lui " + N2);
        }

    }
    public static boolean number(int num1, int num2){
        if((num1%num2)==0)
            return true;
        else
            return false;

    }

}
