package Codes.Semana_01.list01_exercise;

import java.util.Scanner;

/*
    Osmar adora chocolates e vai para a loja com N dinheiro no bolso. O preço de cada chocolate é C.
    A loja oferece um desconto: para cada M embalagens que ele dá para a loja, ele ganha um chocolate grátis.
    Quantos chocolates Osmar consegue comer? Por exemplo:

    Para N=10, C=2, M=5, ele pode comprar 5 chocolates por $10 e trocar as 5 embalagens por mais 1 chocolate,
    fazendo com que o número total de chocolates que ele pode comer seja 6.
    Faça um programa que leia inteiros N, C e M e imprima a quantidade de chocolates que Osmar pode comer.
    C e M são inteiros positivos.

    Entrada	Saída
    10      6
    2
    5
 */
public class Ex04 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        Ex04 ex04 = new Ex04();

        int N = leitor.nextInt();
        int C = leitor.nextInt();
        int M = leitor.nextInt();

        System.out.println(ex04.compute(N, C, M));
        //Leia o input
        //Crie uma variável do tipo deste arquivo. Exemplo: Ex02 ex = new Ex02();
        //Escreva o resultado da chamada do método compute() aqui
    }

    int compute(int n, int c, int m) {

        if(c < 0 || m < 0) return 0;
        int qtd = n/c;
        int bonus = m/c;
        int total = qtd + bonus;

        return total;
    }
}
