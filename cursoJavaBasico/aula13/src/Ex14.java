//Esse programa calcula o tempo estimado para download

import java.util.Scanner;

public class Ex14 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual o tamanha do aquivo ou programa a ser baixado em MB: ");
        double tamanho  = scan.nextDouble();
        System.out.println("Qual a velocidade da internet em Mbps: ");
        double link = scan.nextDouble();
        double velocidadeMBs = link / 8;

        double tempo = tamanho / velocidadeMBs;

        System.out.printf("O tempo estimado para seu download è de " + "%.0fs" ,tempo);
    }
}
