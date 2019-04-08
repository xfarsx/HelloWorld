package br.com.digitalhouse;
import java.util.Scanner;
import java.util.ArrayList;
import java.lang.String;

public class Exc6 {
    public static void main (String [] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int numA, numI;
        Scanner sc = new Scanner(System.in);
        System.out.println("Tamanho do Array: ");
        numA = sc.nextInt(); //Recebe um número para o tamanho Array
        list.ensureCapacity(numA);//Dimensiona o tamanho do array
        for (int i=0;i<numA;i++){
            System.out.println("Digite um Número: ");
            numI = sc.nextInt(); //Recebe o número para colocar no Array
            if (numI%2==0){//Verifica se é par
                list.add (numI);}}//Adiciona o número ao Array
        System.out.println("Os pares do Array são: " + list);
    }
}