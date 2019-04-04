package br.com.digitalhouse;
import java.util.Scanner;

public class Exercicio3 {
    public static void main (String [] args) {
        int num1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        num1 = sc.nextInt();
        System.out.println(num1 % 2!=0 && num1 >10);

    }
}
