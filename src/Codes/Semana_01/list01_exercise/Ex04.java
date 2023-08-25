package Codes.Semana_01.list01_exercise;


import java.util.Scanner;

/*
    Osmar adora chocolates e vai para a loja com N dinheiro no bolso. O preço de cada chocolate é C.
    A loja oferece um desconto: para cada M embalagens que ele dá para a loja, ele ganha um chocolate grátis.
    Quantos chocolates Osmar consegue comer? Por exemplo:

    Para N=10, C=2, M=5, ele pode comprar5  chocolates por $10 e trocar as 5 embalagens por mais 1 chocolate,
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

        Scanner scanner = new Scanner(System.in);
        Ex04 ex04 = new Ex04();

        int dinheiro = scanner.nextInt();
        int precoChocolate = scanner.nextInt();
        int embalagensParaTroca = scanner.nextInt();

        System.out.println(ex04.compute(dinheiro, precoChocolate, embalagensParaTroca));
        //Leia o input
        //Crie uma variável do tipo deste arquivo. Exemplo: Ex02 ex = new Ex02();
        //Escreva o resultado da chamada do método compute() aqui
    }

    int compute(int dinheiro, int precoChocolate, int embalagensParaTroca) {

        int quantidadeChocolate = dinheiro / precoChocolate;

        int bonusDeChocolates = quantidadeChocolate / embalagensParaTroca;

        int sobraDeChocolates = quantidadeChocolate % embalagensParaTroca;

        int totalDeChocolates = quantidadeChocolate;

        while(bonusDeChocolates > 1){

            totalDeChocolates += bonusDeChocolates;
            bonusDeChocolates = bonusDeChocolates / quantidadeChocolate + sobraDeChocolates;
            sobraDeChocolates = bonusDeChocolates % quantidadeChocolate + sobraDeChocolates;
        }

        /*

        int sobra = quantidadeChocolate % embalagensParaTroca;

        int total = quantidadeChocolate + bonus ;



        /*if(bonus + sobra/embalagensParaTroca >= 1){

            if(sobra >= 1) total += sobra;

            while(bonus/m >= 1) {
                total += bonus / m;
                sobra = bonus % m;
                bonus = bonus / m + sobra;
            }

        }*/

        return totalDeChocolates;
    }
}