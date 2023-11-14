import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        // Peça 2 numeros inteiros e um real.
        System.out.println("Digite um número inteiro: ");
        int numInt1 = scan.nextInt();
        System.out.println("Digite outro número inteiro: ");
        int numInt2 = scan.nextInt();
        System.out.println("Digite um número real: ");
        double numReal = scan.nextDouble();

        // Calcule e mostre o produto do dobro do primeiro com a metade do segundo numero
        int result1 = numInt1*2 + numInt2/2;
        System.out.println("O produto do dobro do primeiro com metado do segundo é: " + result1);

        // Calcule e mostre soma do triplo do primeiro com o terceiro
        double result2 = 3*numInt1 + numReal;
        System.out.println("A soma é: " + result2);

        //O terceiro elevado ao cubo
        double result3 = Math.pow(numReal, 3);
        System.out.println("O terceiro número elevado ao cubo é: " + result3);
    }
}
