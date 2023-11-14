import java.util.Scanner;

public class Exercicio2 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um  número: ");
        int num1 = scan.nextInt();

        if (num1 > 0) {
            System.out.println("O número digitado è positivo.");
        } else {
            System.out.println("O número digitado é negativo.");
        }

    }
}
