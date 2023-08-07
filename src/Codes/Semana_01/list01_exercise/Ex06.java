package Codes.Semana_01.list01_exercise;

import java.util.Locale;
import java.text.DecimalFormatSymbols;
import javax.print.DocFlavor;
import java.util.Scanner;
import java.text.DecimalFormat;


/*
    Sabe-se que uma lata de tinta tem um custo C e é capaz de pintar uma área de M metros quadrados.
    Faça um programa que leia a largura L, a altura A de uma parede, o valor C de uma lata de tinta e
    o rendimento M desta lata. Após isso, imprima quantas latas de tintas são necessárias e o custo
    total (com duas casas decimais). Assuma que não é possível comprar lata de tinta fracionada.

    Exemplos de entrada e saída:
    Entrada   	Saída
    4           4 20.00
    3
    5
    3

    Entrada	    Saída
    10.0        3 15.00
    2.0
    5.0
    7
*/
public class Ex06 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Ex06 ex06 = new Ex06();

        double L = leitor.nextDouble();
        double a = leitor.nextDouble();
        double c = leitor.nextDouble();
        double m = leitor.nextDouble();

        System.out.println(ex06.compute(L, a, c, m));
        //Leia o input
        //Crie uma variável do tipo deste arquivo. Exemplo: Ex02 ex = new Ex02();
        //Escreva o resultado da chamada do método compute() aqui
    }

    String compute(double L, double a, double c, double m) {

        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
        DecimalFormat decimalFormat = new DecimalFormat("#.00", symbols);

        double area = L * a;

        int need = (int) Math.ceil(area / m);

        double cost = c * need;

        if(cost == 0) return need + " 0.00";

        return need + " " + decimalFormat.format(cost);
    }
}
