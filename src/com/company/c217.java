package com.company;

import java.util.Scanner;

public class c217
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n1;
        int n2;
        int n3;
        int suma;
        int media;
        int produs;
        int mic;
        int mare;

        System.out.print("Introduceti primul integer: ");
        n1 = input.nextInt();

        System.out.print("Introduceti al doilea integer: ");
        n2 = input.nextInt();

        System.out.print("Introduceti al treilea integer: ");
        n3 = input.nextInt();

        suma = n1 + n2 + n3;
        media = (suma) / 3;
        produs = n1 * n2 * n3;

        mic = n1;
        if (n2 <= mic)
            mic = n2;

        if (n3 <= mic)
            mic = n3;

        mare = n1;
        if (n2 >= mare)
            mare = n2;

        if (n3 >= mare)
            mare = n3;

        System.out.printf("Suma este %d\n", suma);
        System.out.printf("Media este %d\n", media);
        System.out.printf("Produsul este %d\n", produs);
        System.out.printf("Cel mai mic este %d\n", mic);
        System.out.printf("Cel mai mare este %d\n", mare);

    }

}
