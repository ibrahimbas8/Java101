package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int sayi1,sayi2;
        Scanner input = new Scanner(System.in);

        System.out.print("Sayi 1 giriniz: ");
        sayi1 = input.nextInt();
        System.out.print("Sayi 2 giriniz: ");
        sayi2 = input.nextInt();
        if (sayi2>sayi1){
            int temp = sayi2;
            sayi2 = sayi1;
            sayi1 = temp;
        }

        int ebob = 1, sayac=sayi1;

        while (sayac>=0){
            if (sayi1%sayac==0 && sayi2%sayac==0){
                ebob = sayac;
                break;
            }
            sayac--;
        }
        System.out.println("Ebob değeri : " + ebob);

        int ekok = sayi1*sayi2/ebob;
        System.out.println("Ekok değeri : " + ekok);

        sayac = 1;
        while (sayac<=sayi1*sayi2){
            if (sayac%sayi1 == 0 && sayac%sayi2 == 0){
                System.out.println("Ekok değeri : " + sayac);
                break;
            }
            sayac++;
        }

    }
}
