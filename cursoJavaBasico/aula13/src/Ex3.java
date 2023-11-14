import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número: ");
        double num1 = scan.nextDouble();
        System.out.println("Digite outro número: ");
        double num2 = scan.nextDouble();

        double soma = num1 + num2;

        System.out.println("A soma entre " + num1 + " e " + num2 + " é: " + soma);
    }
}
