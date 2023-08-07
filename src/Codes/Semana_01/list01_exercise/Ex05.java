package Codes.Semana_01.list01_exercise;


import java.util.Locale;
import java.text.DecimalFormatSymbols;
import javax.print.DocFlavor;
import java.util.Scanner;
import java.text.DecimalFormat;

/*
    A avenida principal da cidade de Algoritmopolis possui limite de velocidade de L km/h.
    Se o motorista ultrapassar essa velocidade, é aplicado uma multa de R$ M, mais R$ A
    por cada km acima do limite. Faça um programa que leia o limite L, o valor da multa M,
    o valor adicional A e a velocidade V captada pelo radar e informe o valor total da multa.
    Considere L e V sempre como números inteiros. Apresente a resposta com duas casas decimais.

    Exemplos de entrada e saída:
    Entrada	    Saída
    60          200.00
    150.00
    10.00
    65

    Entrada	    Saída
    60          0.00
    150.00
    10.00
    50
*/
public class Ex05 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Ex05 ex05 = new Ex05();

        int L = leitor.nextInt();
        double M = leitor.nextDouble();
        double A = leitor.nextDouble();
        int V = leitor.nextInt();

        System.out.println(ex05.compute(L,M,A,V));
        //Leia o input
        //Crie uma variável do tipo deste arquivo. Exemplo: Ex02 ex = new Ex02();
        //Escreva o resultado da chamada do método compute() aqui
    }

    String compute(int L, double M, double A, int V) {

        if(V <= L) return "0.00";

        double multa = M + ((V-L) * A);

        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
        DecimalFormat decimalFormat = new DecimalFormat("#.00", symbols);

        return decimalFormat.format(multa);
    }
}
