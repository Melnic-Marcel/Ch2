package com.company;

import java.util.Scanner;

public class c225
{
    public static void main(String[] args)
    {

        Scanner input=new Scanner(System.in);
        int n;

        System.out.println("Introduceti un numar: ");
        n=input.nextInt();

        if(number(n)){
            System.out.println(n + " este par");

        }
        else{
            System.out.println(n + " este impar");
        }
    }
    public static boolean number(int num){
        if((num%2)==0)
            return true;
        else
            return false;
    }


}