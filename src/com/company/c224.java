package com.company;

import java.util.Scanner;

public class c224
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n1,
                n2,
                n3,
                n4,
                n5,
                mare,
                mic;

        System.out.print("Introduceti primul integer: ");
        n1 = input.nextInt();

        System.out.print("Introduceti al doilea integer: ");
        n2 = input.nextInt();

        System.out.print("Introduceti al treilea integer: ");
        n3 = input.nextInt();

        System.out.print("Introduceti al patrulea integer: ");
        n4 = input.nextInt();

        System.out.print("Introduceti al cincilea integer: ");
        n5 = input.nextInt();

        mare = 1;
        mic = 1;

        if (n2 > mare)
            mare = n2;
        if (n3 > mare)
            mare = n3;
        if (n4 > mare)
            mare = n4;
        if (n5 > mare)
            mare = n5;

        if (n2 < mic)
            mic = n2;
        if (n3 < mic)
            mic = n3;
        if (n4 < mic)
            mic = n4;
        if (n5 < mic)
            mic = n5;

        System.out.printf("Cel mai mare din acesti cinci integeri este %d, iar cel mai mic este %d%n", mic, mare);
    }
}