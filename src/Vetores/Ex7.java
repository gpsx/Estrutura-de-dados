package Vetores;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        int[] vet1 = new int[5];
        int[] vet2 = new int[5];

        int[] vet3 = new int[10];

        Scanner leitor = new Scanner(System.in);
        for (int i = 0; i < vet1.length ; i++) {
            System.out.println("Digite um numero no vetor 1");
            vet1[i] = leitor.nextInt();
            System.out.println("Digite um numero vetor 2");
            vet2[i] = leitor.nextInt();
        }
        for (int i = 0; i < vet3.length ; i++) {
            
        }
    }
}
