package br.com.digitalhouse;
import java.util.Scanner;

public class Exercicio2 {
    public static void main (String [] args) {
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        num1 = sc.nextInt();
        System.out.println("Digite um número: ");
        num2 = sc.nextInt();
        System.out.println(num1 > num2);
    }
}
