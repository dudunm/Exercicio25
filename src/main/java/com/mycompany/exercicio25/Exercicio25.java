package com.mycompany.exercicio25;
import java.util.*;

public class Exercicio25 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int qtd = 3;
        int vetor[] = new int[qtd];   
        
        for(int i = 0; i < qtd; i++){
            System.out.print("Digite um número: ");
            int num = scan.nextInt();
            vetor[i] = num;
        }
        
        int soma = 0;
        for(int i = 0; i < qtd; i++){
            soma = soma + vetor[i];
        }
        
        double media = soma / qtd;
        
        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);
    }
}
