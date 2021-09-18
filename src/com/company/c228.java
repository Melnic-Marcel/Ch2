package com.company;

import java.util.Scanner;


public class c228
{
    public static void main(String[]args){

        Scanner input=new Scanner(System.in);

        int raza=0;
        double pi=Math.PI;


        System.out.println("Introduceti raza:");
        raza=input.nextInt();


        System.out.printf("Diametru =  %.1f\n", 2*(double)raza);

        System.out.printf("Circumferenta =  %.1f\n", 2*pi*(double)raza);

        System.out.printf("Aria =  %.1f", pi*(double)(raza*raza));




    }

}

