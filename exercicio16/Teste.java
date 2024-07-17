package exercicio16;

import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pilha pilha = new Pilha(50);

        System.out.println("Digite a base que gostaria de converter: ");
        int base = sc.nextInt();
        System.out.println();
        System.out.println("Digite o decimal que gostaria de converter: ");
        int decimal = sc.nextInt();

        pilha.converterDecimal(decimal, base);
        System.out.println();
        System.out.println(pilha.toString());

        sc.close();
    }
}
