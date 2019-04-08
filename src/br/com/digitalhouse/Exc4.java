package br.com.digitalhouse;
import java.util.ArrayList;

public class Exc4 {
    public static void main (String [] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int soma = 0;
        list.add(2);
        list.add(4);
        list.add(6);
        list.add(8);
        for (int i=0;i<list.size();i++){
        soma=soma+list.get(i);  }//Soma todos os numeros dentro do Array
        System.out.println("Soma do Array é: " + soma);
    }
}
