package br.com.digitalhouse;
import java.util.Scanner;
import java.util.ArrayList;


public class Exc5 {
    public static void main (String [] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int numA, numI;
        int soma = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Tamanho do Array: ");
        numA = sc.nextInt(); //Recebe um número para o tamanho Array
        list.ensureCapacity(numA);//Dimensiona o tamanho do array
        for (int i=0;i<numA;i++){
            System.out.println("Digite um Número: ");
            numI = sc.nextInt(); //Recebe o número para colocar no Array
            list.add (numI);//Adiciona o número ao Array
            if (numI%2==0){
            soma=soma+numI;}
            }//Soma todos os números dentro do Array
        System.out.println("Soma do Array é: "+soma);
    }
}