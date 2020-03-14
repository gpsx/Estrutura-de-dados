package Vetores;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {

        String[] marcaCarro = new String[5];
        int[] consumoCarro = new int[5];
        int iCarro = 0;
        int consumoAtual = 0;
        Scanner leitor = new Scanner(System.in);

        for (int i = 0; i < marcaCarro.length ; i++) {
            System.out.println("Digite uma marca de carro");
            marcaCarro[i] = leitor.next();
            System.out.println("Digite o consumo do carro "+ marcaCarro[i]);
            consumoCarro[i] = leitor.nextInt();
            if (consumoCarro[i] > consumoAtual){
                iCarro = i;
                consumoAtual = consumoCarro[i];
            }
        }

        System.out.println("O carro que mais faz quilometros com 1 litro de combustível" +
                " é "+marcaCarro[iCarro]+" com "+consumoCarro[iCarro] +" por litro");
    }
}
