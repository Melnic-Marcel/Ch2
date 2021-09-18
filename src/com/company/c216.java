package com.company;

import java.util.Scanner;

public class c216
{

    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);

        int num1;
        int num2;

        System.out.print("Introduceti primul integer ");
        num1 = input.nextInt();

        System.out.print("Introduceti al doilea integer: ");
        num2 = input.nextInt();

        if (num1 > num2)
            System.out.printf("%d este mai mare",num1);

        if (num1 < num2)
            System.out.printf("%d este mai mare" ,num2);

        if (num1 == num2)
            System.out.println("Aceste numere sunt egale");
    }
}
