package br.com.digitalhouse;
import java.util.Scanner;

public class Main {
    public static void main (String [] args) {
        System.out.println("Hello World!");
        Integer umNumeroA;
        Double umNumeroB;
        String umaCadeiaDeTexto;
        umNumeroA = 10;
        umNumeroB = 20.0;
        umaCadeiaDeTexto = "Eu sou o Fernando";
        System.out.println(umNumeroA);
        System.out.println(umNumeroB);
        System.out.println(umaCadeiaDeTexto);
        System.out.println("soma de A + B = " + (umNumeroA + umNumeroB));
        System.out.println("subtração de A - B = " + (umNumeroA - umNumeroB));
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Digite um número: ");
        umNumeroA = sc.nextInt();
        System.out.println("Recebi: " + umNumeroA);

    }
}
